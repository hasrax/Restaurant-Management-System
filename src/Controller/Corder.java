
package Controller;

import Model.Morder;
import java.sql.*;

public class Corder 
{    Morder m1=new Morder();
    
    public ResultSet checkcat()
    {
        return m1.getcat();
    }
    
    public void checkorder(String oid,String date1)
    {
        m1.addorder(oid, date1);
    }
    
    public void checkHistory(String oid,String Iid,int qty,double total,String pid)
    {
        m1.addHistory(oid, Iid, qty, total,pid);
    }
    
    public void checkcash(String pid,String oid,String cash,String cus,String bill,double addi,String eid,String date1)
    {
        m1.addcash(pid, oid, cash, cus, bill, addi, eid, date1);
    }
    
    public void checkcard(String pid,String oid,String card,String cus,String bill,double addi,String eid,String date1)
    {
        m1.addcard(pid, oid, card, cus, bill, addi, eid, date1);
    }
    
    public ResultSet checkEmp()
    {
        return m1.getEmp();
    }
}
