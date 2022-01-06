package Interface;

import Model.Model_Main;

public interface Interface_Main extends Interface_Sub<Model_Main>{

    public boolean Control(int Id);

    public boolean Delete(int Id);

    public void Update(int Id);

    public void Open();

}
