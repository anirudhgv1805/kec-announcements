package com.kecannouncements.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String userName;
    private String password;
    private String mail;
    private String dept;
    private Role role;
    private String section;
    

    public Long getId() {
      return this.id;
    }
    public void setId(Long value) {
      this.id = value;
    }

    public String getUserId() {
      return this.userId;
    }
    public void setUserId(String value) {
      this.userId = value;
    }

    public String getUserName() {
      return this.userName;
    }
    public void setUserName(String value) {
      this.userName = value;
    }

    public String getPassword() {
      return this.password;
    }
    public void setPassword(String value) {
      this.password = value;
    }

    public String getMail() {
      return this.mail;
    }
    public void setMail(String value) {
      this.mail = value;
    }

    public String getDept() {
      return this.dept;
    }
    public void setDept(String value) {
      this.dept = value;
    }

    public Role getRole() {
      return this.role;
    }
    public void setRole(Role value) {
      this.role = value;
    }

    public String getSection() {
      return this.section;
    }
    public void setSection(String value) {
      this.section = value;
    }
}
