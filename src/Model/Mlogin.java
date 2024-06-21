
package Model;

import View.Dashboard;
import javax.swing.JOptionPane;
import java.sql.*;
public class Mlogin 
{
    
    public void getLogin(String eid,String pw)
    {
        try
        {
            String query="select * from Employee where E_ID=? and password=?";
            PreparedStatement pst=DatabaseCon.dbcon().prepareStatement(query);
            pst.setString(1,eid);
            pst.setString(2,pw);
           
            ResultSet rst=pst.executeQuery();
            
            if(rst.next())
            {
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Login Failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
