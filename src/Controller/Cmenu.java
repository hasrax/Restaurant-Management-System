
package Controller;

import Model.Mmenu;
import java.sql.*;

public class Cmenu
{   Mmenu m2=new Mmenu();
    
    public ResultSet checkMenu()
    {
        return m2.getMenu();
    }
    
    public ResultSet checkCategory()
    {
        return m2.getCategory();
    }
    
    public void checkadd(String id,String name,double price,String category)
    {
        m2.addDetails(id,name,price,category);
    }
    
    public void checkremove(String v1)
    {
        m2.remove(v1);
    }
}
