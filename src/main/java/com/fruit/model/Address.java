package com.fruit.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by 快乐的小菌菌 on 2017/6/27.
 * 地址表，一个用户可以对应多个地址
 */
@Entity
public class Address {
    private String id;
    private String address;
    private Users users;

    public Address() {
    }

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
