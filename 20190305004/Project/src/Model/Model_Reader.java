package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Model_Reader extends Model_Main {

    private String name, surname, gender, phone, _class, school_no, address;

    public Model_Reader() {
        super.setTableName("reader");
    }

    public Model_Reader(int Id) {
        super(Id);
    }

    public Model_Reader(ResultSet resultSet) {
        try {
            super.setId(resultSet.getInt("Id"));
            this.name = resultSet.getString("name");
            this.surname = resultSet.getString("surname");
            this.gender = resultSet.getString("gender");
            this.phone = resultSet.getString("phone");
            this._class = resultSet.getString("class");
            this.school_no = resultSet.getString("schoolno");
            this.address = resultSet.getString("address");

        } catch (SQLException ex) {
            Logger.getLogger(Model_Reader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Model_Reader(int Id, String name, String surname, String gender, String phone, String _class, String school_no, String address) {
        super.setId(Id);
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.phone = phone;
        this._class = _class;
        this.school_no = school_no;
        this.address = address;
    }

    public Model_Reader(String name, String surname, String gender, String phone, String _class, String school_no, String address) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.phone = phone;
        this._class = _class;
        this.school_no = school_no;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Model_Reader{" + "name=" + name + ", surname=" + surname + ", gender=" + gender + ", phone=" + phone + ", _class=" + _class + ", school_no=" + school_no + ", address=" + address + '}';
    }

    @Override
    public String[] getColumn() {
        return new String[]{"Id", "Name", "Surname", "Gender", "Phone", "Class", "School No", "Address"};
    }

    @Override
    public Object[] getObject() {
        return new Object[]{super.getId(), name, surname, gender, phone, _class, school_no, address};
    }

    @Override
    public String getInsert() {
        String sorgu = "insert into " + super.getTableName()
                + " (name, surname, gender, phone, class, schoolno, address) values("
                + "'" + name + "', '" + surname + "', '" + gender + "', '" + phone + "', '" + _class + "', '" + school_no + "', '" + address
                + "')";
        return sorgu;
    }

    @Override
    public String getUpdate() {
        String sorgu = "update " + super.getTableName() + " set "
                + "name='" + name + "', surname='" + surname + "', gender='" + gender + "', phone='" + phone + "', class='" + _class + "', schoolno='" + school_no + "', address='" + address + "'"
                + " Where Id=" + super.getId();
        return sorgu;
    }

    @Override
    public String getSearch(String value) {
        String sorgu = "select * from " + super.getTableName() + " Where "
                + "name LIKE '%" + value + "%' or "
                + "surname LIKE '%" + value + "%' or "
                + "gender LIKE '%" + value + "%' or "
                + "phone LIKE '%" + value + "%' or "
                + "class LIKE '%" + value + "%' or "
                + "schoolno LIKE '%" + value + "%' or "
                + "address LIKE '%" + value + "%'";
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String get_Class() {
        return _class;
    }

    public void set_Class(String _class) {
        this._class = _class;
    }

    public String getSchool_no() {
        return school_no;
    }

    public void setSchool_no(String school_no) {
        this.school_no = school_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

 
}
