package com.fruit.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by 快乐的小菌菌 on 2017/6/27.
 * 用户表，存放用户所有信息(address除外)
 */
@Entity
public class Users {
    private String id;
    private String name;
    private String password;
    private String email;
    private String phone;

    public Users() {
    }

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
