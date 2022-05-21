/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPackage;
//import com.mycompany.doctorFinder.admin;
import java.sql.Connection;
import java.sql.*;
import java.io.FileInputStream;
import java.io.*;
import java.util.*;



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
            FileReader reader = new FileReader("src\\database.properties");
            
            Properties pro = new Properties();
            pro.load(reader);
            //read props
            String url = pro.getProperty("dburl");
            String pass = pro.getProperty("pass");            
            String user = pro.getProperty("user");
            
            con = DriverManager.getConnection(url, user, pass);
          
            System.out.println("Connected");
            
                        }
        }
        catch (SQLException | IOException  e)
        {
             System.out.println("Not connected " + e.getMessage());   
        }
        return con;
            
    
        


}
   

}
