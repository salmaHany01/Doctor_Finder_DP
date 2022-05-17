/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPackage;
import java.awt.List;
import userPackage.Userfarah;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author DELL
 */
public class Admin {
    private static Admin instance = new Admin();
   // private Admin(){}
	public Admin(){}
	private String username;
    private String password;
    private int id= 0;  
    public static Admin getInstance(){
        return instance;
    }
    
    Connection con = DatabaseConnectionDoc.setConnection();
    public boolean AddUser(Userfarah u) {
          try
       {
            //Connection con = DatabaseConnectionDoc.setConnection();
            Statement st = con.createStatement();
            String sql = "insert into User1 values ('" +u.getFname()+ "','" +u.getLname()+ "','" + u.getGender()+"',"+ u.getAge()+"," + u.getPhoneNo1()+ "," + u.getPhoneNo2()+",'" +u.getAddress()+ "','" + u.getEmail()+ "','" + u.getPass() +"')";
            st.executeUpdate(sql); 
            con.close();
            return true;
        }
        catch(SQLException e)
        {
            
            return false;     
        }
    }
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
