/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.Login;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

public class Mmenu 
{
    //To get Items of the menu
    public ResultSet getMenu()
    {
        ResultSet rst = null;
    try
        {
            Statement st=DatabaseCon.dbcon().createStatement();
            rst= st.executeQuery("select * from Item");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return rst;
    }
    
    //To get details from category to jcombobox
    public ResultSet getCategory()
    {
            ResultSet rst2 = null;
    try
        {
            Statement st=DatabaseCon.dbcon().createStatement();
            rst2= st.executeQuery("select C_ID from Category");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return rst2;
    }
    
    //to add new items
    public void addDetails(String id,String name,double price,String category)
    {
        try
        {
            String query2="insert into Item values(?,?,?,?)";
            PreparedStatement pst=DatabaseCon.dbcon().prepareStatement(query2);
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, category);
            pst.setDouble(4, price);
            int row_count=pst.executeUpdate();
            if(row_count>0)
            {
                JOptionPane.showMessageDialog(null, "Data added!", "info", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Data cannot be added!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    //To remove items
    public void remove(String v1)
    {
        try
        {
            String query3="delete from Item  where I_ID='"+v1+"' ";
            Statement st=DatabaseCon.dbcon().createStatement();
            int a=JOptionPane.showConfirmDialog(null, "Are you sure want to delete?", "Log Out", JOptionPane.YES_NO_CANCEL_OPTION);
            if(a==0)
            {
                st.executeUpdate(query3);
            }
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
