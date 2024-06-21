/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Mlogin;
public class Clogin 
{
    Mlogin admin=new Mlogin();
    public void CheckLogin(String eid,String pw)
    {
        
        admin.getLogin(eid,pw);
    }
}
