package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interface.Interface_Database;

public class Controller_Database implements Interface_Database {

    @Override
    public Connection Baglanti() {
        try {
            Connection connection = null;
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            return connection;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Controller_Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean Sorgu(String sorgu) {
        try {
            Connection connection = new Controller_Database().Baglanti();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sorgu);
            stmt.close();
            connection.close();
            return true;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean CreateTable() {
        try {
            Connection connection = new Controller_Database().Baglanti();
            Statement statement = connection.createStatement();

            String tbl_user = "CREATE TABLE user ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "username TEXT,"
                    + "password TEXT"
                    + ")";

            String tbl_reader = "CREATE TABLE reader ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "name TEXT,"
                    + "surname TEXT,"
                    + "gender TEXT,"
                    + "phone TEXT,"
                    + "class TEXT,"
                    + "schoolno TEXT,"
                    + "address TEXT"
                    + ")";

            String tbl_book = "CREATE TABLE book("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "name TEXT,"
                    + "genre TEXT,"
                    + "author TEXT,"
                    + "broadcaster TEXT,"
                    + "description TEXT,"
                    + "cabinet TEXT,"
                    + "shelf TEXT,"
                    + "pubyear INTEGER,"
                    + "pagenumber INTEGER"
                    + ")";

            String tbl_deposit = "CREATE TABLE deposit("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "book_id INTEGER,"
                    + "reader_id INTEGER,"
                    + "day INTEGER,"
                    + "date TEXT,"
                    + "rebate_date TEXT"
                    + ")";

            statement.executeUpdate(tbl_user);
            statement.executeUpdate(tbl_reader);
            statement.executeUpdate(tbl_book);
            statement.executeUpdate(tbl_deposit);

            statement.close();
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Database.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean Reset() {
        try {
            Connection connection = Baglanti();
            Statement statement = connection.createStatement();

            String tbl_user = "DROP TABLE user";
            String tbl_reader = "DROP TABLE reader";
            String tbl_book = "DROP TABLE book";
            String tbl_deposit = "DROP TABLE deposit";

            statement.executeUpdate(tbl_user);
            statement.executeUpdate(tbl_reader);
            statement.executeUpdate(tbl_book);
            statement.executeUpdate(tbl_deposit);

            statement.close();
            connection.close();
            return CreateTable();
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Database.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
