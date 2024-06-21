/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hasra
 */
public class Mreceipt 
{
    public ResultSet getData()
    {
         ResultSet rst = null;
        try
        {
            Statement st=DatabaseCon.dbcon().createStatement();
            rst= st.executeQuery("select * from OrderHistory");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return rst;
    }
    
}
