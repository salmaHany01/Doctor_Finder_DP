/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPackage;
import userPackage.Userfarah;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class Admin {
    private static Admin instance = new Admin();
    private Admin(){}
   
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
        private String username;
    private String password;
    private int id= 0;  
  
   //Resultset is considered a pointer hence it's used to point at a row and get it's data   
     public void setId(int id) {
            this.id = id;
        }
      public int getId() {
            return id;
        }
 
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
 public boolean Login()
    {
        if(this.username.equals("Admin") && this.password.equals("admin1234"))
        {
            return true;
        }
        else
        {
            return false;
        }
}
    
}
