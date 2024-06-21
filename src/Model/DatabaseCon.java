
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DatabaseCon 
{
    private static Connection con;
    public static Connection dbcon()
    {
        try
        {
            String dbpath="jdbc:mysql://localhost/CODSE222F002";
            con=DriverManager.getConnection(dbpath, "root", "");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return con;
    }
}