package Controller;

import Model.Model_Book;
import Model.Model_Book;
import Model.Model_Main;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controller_Book extends Controller_Main {

    public Controller_Book() {
        super(new Model_Book());
    }

    public boolean Control(String kitap_ad) {
        try {
            connection = new Controller_Database().Baglanti();
            statement = connection.createStatement();
            String sorgu = "Select * From " + super.getTableName()
                    + " Where name='" + kitap_ad + "'";
            resultSet = statement.executeQuery(sorgu);
            while (resultSet.next()) {
                resultSet.close();
                connection.close();
                return true;
            }
            resultSet.close();
            connection.close();
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Book.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList<Model_Main> List(JTable Tablo) {
        try {
            String sorgu = "Select * From " + super.getTableName();
            connection = new Controller_Database().Baglanti();
            resultSet = statement.executeQuery(sorgu);

            DefaultTableModel model = (DefaultTableModel) Tablo.getModel();
            model.setRowCount(0);
            ArrayList<Model_Main> arrayList = new ArrayList<>();

            while (resultSet.next()) {
                Model_Book kayit = new Model_Book(resultSet);
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }

            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Book.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public ArrayList<Model_Main> Search(JTable Tablo, String aranan) {
        try {
            connection = new Controller_Database().Baglanti();
            System.out.println(new Model_Book().getSearch(aranan));
            resultSet = statement.executeQuery(new Model_Book().getSearch(aranan));

            DefaultTableModel model = (DefaultTableModel) Tablo.getModel();
            model.setRowCount(0);
            ArrayList<Model_Main> arrayList = new ArrayList<>();
                
            while (resultSet.next()) {
                Model_Book kayit = new Model_Book(resultSet);
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }
            resultSet.close();
            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Book.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean Add(Model_Main model) {
        Model_Book model2 = (Model_Book) model;
        model2.setTableName(super.getTableName());
        return new Controller_Database().Sorgu(model2.getInsert());
    }

    @Override
    public boolean Update(Model_Main model) {
        Model_Book model2 = (Model_Book) model;
        model2.setTableName(super.getTableName());
        return new Controller_Database().Sorgu(model2.getUpdate());
    }

    @Override
    public Model_Book Get(Model_Main model) {
        Model_Book model2 = (Model_Book) model;
        model2.setTableName(super.getTableName());
        try {
            connection = new Controller_Database().Baglanti();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(model.getGet());
            while (resultSet.next()) {
                model2 = new Model_Book(resultSet);
                resultSet.close();
                connection.close();
                return model2;
            }
            resultSet.close();
            connection.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Book.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public Model_Book Get(String kitap_ad) {
        Model_Book kitap = new Model_Book(kitap_ad);
        kitap.setTableName(super.getTableName());
        try {
            connection = new Controller_Database().Baglanti();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(kitap.getControl());

            while (resultSet.next()) {
                kitap = new Model_Book(resultSet);
                resultSet.close();
                connection.close();
                return kitap;
            }
            resultSet.close();
            connection.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Book.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Update(int Id) {
        new View.View_Book(Id).setVisible(true);
    }

    @Override
    public void Open() {
        new View.View_Book().setVisible(true);
    }

    @Override
    public boolean Control(Model_Main model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
