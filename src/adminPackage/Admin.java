/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPackage;
import userPackage.Userfarah;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class Admin {
    private static Admin instance = new Admin();
    private Admin(){}
    private String name = "admin";
    private String password = "admin";
    public static Admin getInstance(){
        return instance;
    }
    
    Connection con = DatabaseConnectionDoc.setConnection();
    public boolean AddUser(Userfarah u) {
          try
       {
            //Connection con = DatabaseConnectionDoc.setConnection();
            Statement st = con.createStatement();
            String sql = "insert into Users values ("+u.getId()+",'" +u.getFname()+ "','" +u.getLname()+ "', " + u.getAge()+",'"+ u.getGender()+"','" +u.getAddress()+ "'," + u.getPhoneNo1()+ "," + u.getPhoneNo2()+"," +u.getVisa() +",'" + u.getEmail()+ "','" + u.getPass() +"')";
            st.executeUpdate(sql); 
            con.close();
            return true;
        }
        catch(SQLException e)
        {
            
            return false;     
        }
    }
}
