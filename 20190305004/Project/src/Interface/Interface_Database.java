
package Interface;

import java.sql.Connection;

public interface Interface_Database {
    public boolean Sorgu(String sorgu);
    public boolean CreateTable();
    public Connection Baglanti();
    public boolean Reset();
}
