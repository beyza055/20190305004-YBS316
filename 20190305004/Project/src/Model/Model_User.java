package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Model_User extends Model_Main {

    private String username;
    private String password;

    public Model_User() {
        super.setTableName("user");
    }

    public Model_User(int Id) {
        super(Id);
    }

    public Model_User(ResultSet resultSet) {
        try {
            super.setId(resultSet.getInt("Id"));
            username = resultSet.getString("username");
            password = resultSet.getString("password");
        } catch (SQLException ex) {
            Logger.getLogger(Model_User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Model_User(int Id, String username, String password) {
        super.setId(Id);
        this.username = username;
        this.password = password;
    }

    public Model_User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Model_User{" + "username=" + username + ", password=" + password + '}';
    }

    @Override
    public String[] getColumn() {
        return new String[]{"Id", "Username", "Password"};
    }

    @Override
    public Object[] getObject() {
        return new Object[]{super.getId(), username, password};
    }

    @Override
    public String getInsert() {
        String sorgu = "insert into " + super.getTableName()
                + "(username,password) values("
                + "'" + username + "', '" + password + "'"
                + ")";
        return sorgu;
    }

    @Override
    public String getUpdate() {
        String sorgu = "update " + super.getTableName() + " set "
                + "username='" + username + "', password='" + username + "'"
                + " Where Id=" + super.getId();
        return sorgu;
    }

    @Override
    public String getSearch(String value) {
        String sorgu = "SELECT * FROM " + super.getTableName() + " where username"
                + " LIKE '%" + value + "%' or password LIKE '%" + value + "%'";
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
                + " Where username='" + username + "' and password='" + password + "'";
        return sorgu;
    }

}
