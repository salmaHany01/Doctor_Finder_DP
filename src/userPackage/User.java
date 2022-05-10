/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userPackage;

import java.util.Date;

/**
 *
 * @author Fayroz Tarek
 */
public class User {
    private int id;
    private String Fname;
    private String Lname;
    private String gender;
    private Date birthDate;
    private String phoneNo1;
    private String phoneNo2;
    private String address;
    private String visa;
    private String email;
    private String pass;

    public User(int id, String name, String Lname, String gender, Date birthDate, String phoneNo1, String phoneNo2, String address, String visa, String email, String pass) {
        this.id = id;
        this.Fname = name;
        this.Lname = Lname;
        this.gender = gender;
        this.birthDate = birthDate;
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

    public String getPhoneNo2() {
        return phoneNo2;
    }

    public void setPhoneNo2(String phoneNo2) {
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNo() {
        return phoneNo1;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo1 = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
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

    

}
