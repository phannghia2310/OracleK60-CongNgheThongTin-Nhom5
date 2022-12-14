package com.example.backendjavaspring.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Entity(name = "users")
public class User {
    @Id
    @Column(nullable = false)
    private String emailId;
    @Column(nullable = false)
    private String fullname;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String phone;
    @OneToOne
    private Role role;
    @Column(nullable = false)
    private Timestamp RegistraionDate;


    public User(String emailId, String fullname, String password, String address, String phone, Role role, Timestamp RegistrationDate) {
        this.emailId = emailId;
        this.fullname = fullname;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.role = role;
        this.RegistraionDate = RegistrationDate;
    }

    public User() {
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Timestamp getRegistraionDate() { return RegistraionDate;}

    public void setRegistraionDate(Timestamp RegistraionDate) {this.RegistraionDate=RegistraionDate;}
}
