/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userPackage;

import java.awt.List;
import java.util.ArrayList;
import adminPackage.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fayroz Tarek
 */
public class UserData extends UserBuilder {
    static ArrayList<User> users = new ArrayList<User>();
    Connection con;
    public UserData() {
        try{
        con = DatabaseConnectionDoc.setConnection();
        String sql = "select * from User1";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            UserBuilder user = new UserBuilder();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("fname"));
            user.setLname(rs.getString("lname"));
            user.setGender(rs.getString("gender"));
            user.setBirthDate(rs.getInt("age"));
            user.setPhoneNo1(rs.getInt("phoneNo1"));
            user.setPhoneNo2(rs.getInt("phoneNo2"));
            user.setAddress(rs.getString("address"));
            user.setEmail(rs.getString("email"));
            user.setPass(rs.getString("password"));

            users.add(user.createUser());   
        } 
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }

    public static void display()
    {
        for(int i=0; i<users.size(); i++)
        {
            System.out.println("User " + i + ": ");
            System.out.println(users.get(i).getId()
            + "\t" + users.get(i).getName()
            + "\t" + users.get(i).getLname()
             + "\t" + users.get(i).getAge()
            + "\t" + users.get(i).getGender()
            + "\t" + users.get(i).getPhoneNo()
            + "\t" + users.get(i).getPhoneNo2()
            + "\t" + users.get(i).getAddress()
            + "\t" + users.get(i).getEmail()
            + "\t" + users.get(i).getPass());
            
            System.out.println();
        }
    }
    
    static public User getCertainUser(int id){
        for(int i=0; i<users.size(); i++){
            if(id == users.get(i).getId()){
                return users.get(i);
            }
        }
        return null;
    }
    
    
    
}
