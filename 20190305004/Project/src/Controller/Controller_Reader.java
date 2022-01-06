package Controller;

import Model.Model_Reader;
import Model.Model_Main;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controller_Reader extends Controller_Main {

    public Controller_Reader() {
        super(new Model_Reader());
    }

    @Override
    public boolean Control(Model_Main model) {
        Model_Reader model2 = (Model_Reader) model;
        model2.setTableName(super.getTableName());
        try {
            connection = new Controller_Database().Baglanti();
            statement = connection.createStatement();
            System.out.println(model2.getControl());
            resultSet = statement.executeQuery(model2.getControl());
            while (resultSet.next()) {
                resultSet.close();
                connection.close();
                return true;
            }
            resultSet.close();
            connection.close();
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Reader.class.getName()).log(Level.SEVERE, null, ex);
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
                Model_Reader kayit = new Model_Reader(resultSet);
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }

            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Reader.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public ArrayList<Model_Main> Search(JTable Tablo, String aranan) {
        try {
            connection = new Controller_Database().Baglanti();
            resultSet = statement.executeQuery(new Model_Reader().getSearch(aranan));

            DefaultTableModel model = (DefaultTableModel) Tablo.getModel();
            model.setRowCount(0);
            ArrayList<Model_Main> arrayList = new ArrayList<>();

            while (resultSet.next()) {
                Model_Reader kayit = new Model_Reader(resultSet);
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }
            resultSet.close();
            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Reader.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean Add(Model_Main model) {
        Model_Reader model2 = (Model_Reader) model;
        model2.setTableName(super.getTableName());
        return new Controller_Database().Sorgu(model2.getInsert());
    }

    @Override
    public boolean Update(Model_Main model) {
        Model_Reader model2 = (Model_Reader) model;
        model2.setTableName(super.getTableName());
        return new Controller_Database().Sorgu(model2.getUpdate());
    }

    @Override
    public Model_Reader Get(Model_Main model) {
        Model_Reader model2 = (Model_Reader) model;
        model2.setTableName(super.getTableName());
        try {
            connection = new Controller_Database().Baglanti();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(model2.getGet());
            while (resultSet.next()) {
                model2 = new Model_Reader(resultSet);
                resultSet.close();
                connection.close();
                return model2;
            }
            resultSet.close();
            connection.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Reader.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Update(int Id) {
        new View.View_Reader(Id).setVisible(true);
    }

    @Override
    public void Open() {
        new View.View_Reader().setVisible(true);
    }

}
