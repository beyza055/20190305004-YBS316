package Interface;

import java.util.ArrayList;
import javax.swing.JTable;

public interface Interface_Sub<T> {

    public boolean Control(T model);
    
    public ArrayList<T> List(JTable Tablo);

    public ArrayList<T> Search(JTable Tablo, String aranan);

    public boolean Add(T model);

    public boolean Update(T model);

    public T Get(T model);

}
