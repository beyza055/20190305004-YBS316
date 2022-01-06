package Controller;

import Model.Model_Main;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public abstract class Controller_Main implements Interface.Interface_Main {

    private String tableName;
    private Model_Main model;
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    

    public Controller_Main(Model_Main model) {
        try {
            this.tableName = model.getTableName();
            this.model = model;
            connection = new Controller_Database().Baglanti();
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean Control(int Id) {
        String sorgu = "Select * From " + tableName + " Where Id=" + Id;

        try {
            connection = new Controller_Database().Baglanti();
            resultSet = statement.executeQuery(sorgu);
            if (resultSet.next()) {
                resultSet.close();
                connection.close();
                return true;
            }
            resultSet.close();
            connection.close();
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Main.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean Delete(int Id) {
        String sorgu = "Delete From " + tableName + " Where Id=" + Id;     
        return new Controller_Database().Sorgu(sorgu);
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public String toString() {
        return "Controller_Main{" + "tableName=" + tableName + '}';
    }

    @Override
    public void Update(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Open() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Model_Main getModel() {
        return model;
    }

    public void setModel(Model_Main model) {
        this.model = model;
    }

    @Override
    public ArrayList<Model_Main> List(JTable Tablo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Model_Main> Search(JTable Tablo, String aranan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Add(Model_Main model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(Model_Main model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Model_Main Get(Model_Main model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
