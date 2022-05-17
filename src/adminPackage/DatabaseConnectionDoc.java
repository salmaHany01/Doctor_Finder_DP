/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPackage;
//import com.mycompany.doctorFinder.admin;
import java.sql.Connection;
import java.sql.*;




/**
 *
 * @author DELL
 */
public class DatabaseConnectionDoc {
    
   
    private DatabaseConnectionDoc() {}

 private static Connection con;
     
    public static Connection setConnection()
    {
        try{
            if(con==null)
			{
             
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/DoctorFinder", "doctor","123");
            System.out.println("Connected");
            
                        }
        }
        catch (SQLException e)
        {
             System.out.println("Not connected");
            
           
            
        }
        return con;
            
    
        


}
   

}
