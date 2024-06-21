
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import View.Order.*;


public class Morder
{   public ResultSet getcat()
    {
        ResultSet rst3 = null;
    try
        {
            Statement st=DatabaseCon.dbcon().createStatement();
            rst3= st.executeQuery("select * from Item");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return rst3;
    }

    public void addorder(String oid,String date1)
    {
        try
        {
            String query1="insert into Ordering values(?,?)";
            PreparedStatement pst=DatabaseCon.dbcon().prepareStatement(query1);
            pst.setString(1, oid);
            pst.setString(2, date1);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void addHistory(String oid,String Iid,int qty,double total,String pid)
    {
        try
        {
            String query1="insert into OrderHistory values(?,?,?,?,?)";
            PreparedStatement pst=DatabaseCon.dbcon().prepareStatement(query1);
            pst.setString(1, oid);
            pst.setString(2, Iid);
            pst.setInt(3, qty);
            pst.setDouble(4, total);
            pst.setString(5, pid);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void addcash(String pid,String oid,String cash,String cus,String bill,double addi,String eid,String date1)
    {
            
        try
        {
            String query1="insert into Payment values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst=DatabaseCon.dbcon().prepareStatement(query1);
            pst.setString(1, pid);
            pst.setString(2, oid);
            pst.setString(3, cash);
            pst.setString(4, cus);
            pst.setString(5, bill);
            pst.setDouble(6, addi);
            pst.setString(7, eid);
            pst.setString(8, date1);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void addcard(String pid,String oid,String card,String cus,String bill,double addi,String eid,String date1)
    {
            
        try
        {
            String query1="insert into Payment values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst=DatabaseCon.dbcon().prepareStatement(query1);
            pst.setString(1, pid);
            pst.setString(2, oid);
            pst.setString(3, card);
            pst.setString(4, cus);
            pst.setString(5, bill);
            pst.setDouble(6, addi);
            pst.setString(7, eid);
            pst.setString(8, date1);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public ResultSet getEmp()
    {
        ResultSet rst2 = null;
    try
        {
            Statement st=DatabaseCon.dbcon().createStatement();
            rst2= st.executeQuery("select E_ID from Employee");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return rst2;
    }
}


