/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.*;
import Model.Mreceipt;

/**
 *
 * @author hasra
 */
public class Creceipt 
{
    public ResultSet checkData()
    {
        Mreceipt m1=new Mreceipt();
        return m1.getData();
    }
    
}
