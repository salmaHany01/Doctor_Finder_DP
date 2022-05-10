/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPackage;
//import com.mycompany.doctorFinder.admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class DatabaseConnectionDoc {
    
   // private static DatabaseConnectionDoc instance = new DatabaseConnectionDoc();
    
    
   
    
    private DatabaseConnectionDoc() {}

 private static Connection con;
     
    public static Connection setConnection()
    {
        try{
             
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/DoctorFinder", "doctor","123");
            System.out.println("Connected");
            return con;
        }
        catch (SQLException e)
        {
             System.out.println("Not connected");
            
            return null;
            
        }
            
       
        

}
    public static Connection getConn(){
        return con;
        
    }

}
