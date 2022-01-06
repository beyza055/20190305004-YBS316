package Model;

import Controller.Controller_Book;
import Controller.Controller_Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Model_Deposit extends Model_Main {

    private int book_id;
    private int reader_id;
    private int day;
    private String date;
    private String rebate_date;

    public Model_Deposit() {
        super.setTableName("deposit");
    }

    public Model_Deposit(int Id) {
        super(Id);
    }

    public Model_Deposit(int book_id, int reader_id, int day, String date) {
        this.book_id = book_id;
        this.reader_id = reader_id;
        this.day = day;
        this.date = date;
        this.rebate_date = "-";
    }

    public Model_Deposit(int Id, int book_id, int reader_id, int day, String date) {
        this.book_id = book_id;
        this.reader_id = reader_id;
        this.day = day;
        this.date = date;
        this.rebate_date = "-";
    }

    public Model_Deposit(int Id, int book_id, int reader_id, int day, String date, String rebate_date) {
        super(Id);
        this.book_id = book_id;
        this.reader_id = reader_id;
        this.day = day;
        this.date = date;
        this.rebate_date = rebate_date;
    }

    public Model_Deposit(ResultSet resultSet) {
        try {
            super.setId(resultSet.getInt("Id"));
            book_id = resultSet.getInt("book_id");
            reader_id = resultSet.getInt("reader_id");
            day = resultSet.getInt("day");
            date = resultSet.getString("date");
            rebate_date = resultSet.getString("rebate_date");
        } catch (SQLException ex) {
            Logger.getLogger(Model_Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "Model_Deposit{" + "book_id=" + book_id + ", reader_id=" + reader_id + ", day=" + day + ", date=" + date + ", rebate_date=" + rebate_date + '}';
    }

   
    @Override
    public String[] getColumn() {
        return new String[]{"Id", "Book", "Reader", "Day", "Date", "Rebate Date"};
    }

    @Override
    public Object[] getObject() {
        String book_name = new Controller_Book().Get(new Model_Book(book_id)).getName();
        
        Model_Reader reader = new Controller_Reader().Get(new Model_Reader(reader_id));
        if(reader == null || book_name == null){
            return null;
        }
        return new Object[]{super.getId(), book_name, reader.getName()+ " " + reader.getSurname(), day, date, rebate_date};
    }

    @Override
    public String getInsert() {
        String sorgu = "insert into " + super.getTableName()
                + " (book_id, reader_id, day,date,rebate_date) values("
                + book_id + "," + reader_id + "," + day + ",'" + date + "','-'"
                + ")";
        return sorgu;
    }

    @Override
    public String getUpdate() {
        String sorgu = "update " + super.getTableName() + " set "
                + "book_id=" + book_id + ", reader_id=" + reader_id + ", day=" + day + ",date='" + date + "',rebate_date='" + rebate_date + "'"
                + " Where Id=" + super.getId();
        return sorgu;
    }

    @Override
    public String getSearch(String value) {
        String sorgu = "select * from " + super.getTableName()
                + " Where reader_id=" + value;

        return sorgu;
    }

    @Override
    public String getGet() {
        String sorgu = "select * from " + super.getTableName()
                + " Where Id=" + super.getId();
        return sorgu;
    }

    @Override
    public String getControl() {
        String sorgu = "select * from " + super.getTableName()
                + " Where book_id=" + book_id;
        return sorgu;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getReader_id() {
        return reader_id;
    }

    public void setReader_id(int reader_id) {
        this.reader_id = reader_id;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRebate_date() {
        return rebate_date;
    }

    public void setRebate_date(String rebate_date) {
        this.rebate_date = rebate_date;
    }

}
