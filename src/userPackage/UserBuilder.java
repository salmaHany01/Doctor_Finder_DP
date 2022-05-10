/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userPackage;

import java.util.Date;


public class UserBuilder {

    private int id;
    private String Fname;
    private String Lname = null;
    private String gender;
    private Date birthDate = null;
    private String phoneNo1;
    private String phoneNo2 = null;
    private String address = null;
    private String visa = null;
    private String email;
    private String pass;

    public UserBuilder() {
    }

    public UserBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public UserBuilder setName(String name) {
        this.Fname = name;
        return this;
    }

    public UserBuilder setLname(String Lname) {
        this.Lname = Lname;
        return this;
    }

    public UserBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public UserBuilder setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public UserBuilder setPhoneNo1(String phoneNo1) {
        this.phoneNo1 = phoneNo1;
        return this;
    }

    public UserBuilder setPhoneNo2(String phoneNo2) {
        this.phoneNo2 = phoneNo2;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder setVisa(String visa) {
        this.visa = visa;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public User createUser() {
        return new User(id, Fname, Lname, gender, birthDate, phoneNo1, phoneNo2, address, visa, email, pass);
    }
    
}
