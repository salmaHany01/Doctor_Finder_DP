/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userPackage;

import java.util.Date;
import javafx.scene.layout.Region;

/**
 *
 * @author Fayroz Tarek
 */
public class User {
    
    private int id;
    private String Fname;
    private String Lname;
    private String gender;
    private int age;
    private int phoneNo1;
    private int phoneNo2;
    private String address;
    private int visa;
    private String email;
    private String pass;
    

    public User(int id, String name, String Lname, String gender, int age, int phoneNo1, int phoneNo2, String address, int visa, String email, String pass) {
        this.id = id;
        this.Fname = name;
        this.Lname = Lname;
        this.gender = gender;
        this.age = age;
        this.phoneNo1 = phoneNo1;
        this.phoneNo2 = phoneNo2;
        this.address = address;
        this.visa = visa;
        this.email = email;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public int getPhoneNo2() {
        return phoneNo2;
    }

    public void setPhoneNo2(int phoneNo2) {
        this.phoneNo2 = phoneNo2;
    }
    

    public String getName() {
        return Fname;
    }

    public void setName(String name) {
        this.Fname = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getPhoneNo() {
        return phoneNo1;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo1 = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getVisa() {
        return visa;
    }

    public void setVisa(int visa) {
        this.visa = visa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
   
    

}
