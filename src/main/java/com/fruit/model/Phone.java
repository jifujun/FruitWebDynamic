package com.fruit.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by 快乐的小菌菌 on 2017/6/27.
 * 手机号码表，一个用户可以对应多个收获手机号码
 */
@Entity
public class Phone {
    private String id;
    private String phone;
    private Users users;

    public Phone() {
    }

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
