package Model;

import Interface.Interface_Model;

public abstract class Model_Main implements Interface_Model {

    private int Id;
    private String[] column;
    private String tableName;

    public Model_Main() {

    }
   
    public Model_Main(int Id, String[] column, String tableName) {
        this.Id = Id;
        this.column = column;
        this.tableName = tableName;
    }

    public Model_Main(int Id) {
        this.Id = Id;
    }

    public Model_Main(String tableName) {
        this.tableName = tableName;
    }

    public Model_Main(String[] column, String tableName) {
        this.column = column;
        this.tableName = tableName;
    }

    public String[] getColumn() {
        return column;
    }

    public void setColumn(String[] column) {
        this.column = column;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public int getId() {
        return this.Id;
    }

    @Override
    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "Model_Main{" + "Id=" + Id + ", column=" + column + ", tableName=" + tableName + '}';
    }

    @Override
    public Object[] getObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
