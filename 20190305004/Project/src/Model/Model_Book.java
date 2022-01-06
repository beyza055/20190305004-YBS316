package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Model_Book extends Model_Main {

    private String name;
    private String genre;
    private String author;
    private String broadcaster;
    private String description;
    private String cabinet;
    private int shelf;
    private int pubyear;
    private int pagenumber;

    public Model_Book(String name) {
        this.name = name;
    }

    public Model_Book() {
        super.setTableName("book");
    }

    public Model_Book(String name, String genre, String author, String broadcaster, String description, String cabinet, int shelf, int pubyear, int pagenumber) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.broadcaster = broadcaster;
        this.description = description;
        this.cabinet = cabinet;
        this.shelf = shelf;
        this.pubyear = pubyear;
        this.pagenumber = pagenumber;
    }

    public Model_Book(int Id, String name, String genre, String author, String broadcaster, String description, String cabinet, int shelf, int pubyear, int pagenumber) {
        super(Id);
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.broadcaster = broadcaster;
        this.description = description;
        this.cabinet = cabinet;
        this.shelf = shelf;
        this.pubyear = pubyear;
        this.pagenumber = pagenumber;
    }

    public Model_Book(int Id) {
        super(Id);
    }

    public Model_Book(ResultSet resultSet) {
        try {
            super.setId(resultSet.getInt("Id"));
            name = resultSet.getString("name");
            genre = resultSet.getString("genre");
            author = resultSet.getString("author");
            broadcaster = resultSet.getString("broadcaster");
            description = resultSet.getString("description");
            cabinet = resultSet.getString("cabinet");
            shelf = resultSet.getInt("shelf");
            pubyear = resultSet.getInt("pubyear");
            pagenumber = resultSet.getInt("pagenumber");
        } catch (SQLException ex) {
            Logger.getLogger(Model_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String[] getColumn() {
        return new String[]{"Id", "Name", "Genre", "Author", "Broadcaster", "Description", "Cabinet", "Shelf", "Release Year", "Num of Page"};
    }

    @Override
    public Object[] getObject() {
        return new Object[]{super.getId(), name, genre, author, broadcaster, description, cabinet, shelf, pubyear, pagenumber};
    }

    @Override
    public String getInsert() {
        String sorgu = "insert into " + super.getTableName()
                + " (name, genre, author, broadcaster, description, cabinet, shelf, pubyear, pagenumber) values("
                + "'" + name + "', '" + genre + "', '" + author + "', '" + broadcaster + "', '" + description + "', '" + cabinet + "', " + shelf + ", " + pubyear + ", " + pagenumber
                + ")";
        return sorgu;
    }

    @Override
    public String getUpdate() {
        String sorgu = "update " + super.getTableName() + " set "
                + "name='" + name + "', genre='" + genre + "', author='" + author + "', broadcaster='" + broadcaster
                + "', description='" + description + "', cabinet='" + cabinet + "', shelf=" + shelf
                + ", pubyear=" + pubyear + ", pagenumber=" + pagenumber
                + " Where Id=" + super.getId();
        return sorgu;
    }

    @Override
    public String getSearch(String value) {
        String sorgu = "select * from " + super.getTableName()
                + " where name LIKE '%" + value + "%' or "
                + "genre LIKE '%" + value + "%' or "
                + "author LIKE '%" + value + "%' or "
                + "broadcaster LIKE '%" + value + "%' or "
                + "description LIKE '%" + value + "%' or "
                + "cabinet LIKE '%" + value + "%'" ;
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
                + " Where name='" + name + "'";
        return sorgu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBroadcaster() {
        return broadcaster;
    }

    public void setBroadcaster(String broadcaster) {
        this.broadcaster = broadcaster;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCabinet() {
        return cabinet;
    }

    public void setCabinet(String cabinet) {
        this.cabinet = cabinet;
    }

    public int getShelf() {
        return shelf;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    public int getPubyear() {
        return pubyear;
    }

    public void setPubyear(int pubyear) {
        this.pubyear = pubyear;
    }

    public int getPagenumber() {
        return pagenumber;
    }

    public void setPagenumber(int pagenumber) {
        this.pagenumber = pagenumber;
    }

   

}
