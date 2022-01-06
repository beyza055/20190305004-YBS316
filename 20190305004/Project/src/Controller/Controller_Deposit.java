package Controller;

import Model.Model_Deposit;
import Model.Model_Deposit;
import Model.Model_Main;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controller_Deposit extends Controller_Main {

    public Controller_Deposit() {
        super(new Model_Deposit());
    }

    public boolean Control(int kitap_id) {
        try {
            connection = new Controller_Database().Baglanti();
            statement = connection.createStatement();
            String sorgu = "Select * From " + super.getTableName()
                    + " Where kitap_id=" + kitap_id;
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
            Logger.getLogger(Controller_Deposit.class.getName()).log(Level.SEVERE, null, ex);
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
                Model_Deposit kayit = new Model_Deposit(resultSet);
                if(kayit.getObject() == null)
                    continue;
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }

            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Deposit.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public ArrayList<Model_Main> Search(JTable Tablo, String aranan) {
        try {
            connection = new Controller_Database().Baglanti();
            resultSet = statement.executeQuery(new Model_Deposit().getSearch(aranan));

            DefaultTableModel model = (DefaultTableModel) Tablo.getModel();
            model.setRowCount(0);
            ArrayList<Model_Main> arrayList = new ArrayList<>();

            while (resultSet.next()) {
                Model_Deposit kayit = new Model_Deposit(resultSet);
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }
            resultSet.close();
            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Deposit.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean Add(Model_Main model) {
        Model_Deposit model2 = (Model_Deposit) model;
        model2.setTableName(super.getTableName());
        return new Controller_Database().Sorgu(model2.getInsert());
    }

    @Override
    public boolean Update(Model_Main model) {
        Model_Deposit model2 = (Model_Deposit) model;
        model2.setTableName(super.getTableName());
        return new Controller_Database().Sorgu(model2.getUpdate());
    }

    @Override
    public Model_Deposit Get(Model_Main model) {
        Model_Deposit model2 = (Model_Deposit) model;
        model2.setTableName(super.getTableName());
        try {
            connection = new Controller_Database().Baglanti();
            statement = connection.createStatement();
    
            resultSet = statement.executeQuery(model2.getGet());
            while (resultSet.next()) {
                model2 = new Model_Deposit(resultSet);
              
                resultSet.close();
                connection.close();
                return model2;
            }
            resultSet.close();
            connection.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Deposit.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Update(int Id) {
        new View.View_Deposit(Id).setVisible(true);
    }

    @Override
    public void Open() {
        new View.View_Deposit().setVisible(true);
    }

    @Override
    public boolean Control(Model_Main model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
