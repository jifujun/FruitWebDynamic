package com.fruit.dao;

import com.fruit.model.Users;

import java.util.List;

/**
 * Created by 快乐的小菌菌 on 2017/6/27.
 * 所有管理员、游客或用户操作对用户表的操作
 */
public interface UsersDao {
    void userRegister(Users users);
    void userUpdate();
    List<Users> userIsExist(String phone, String password);
}
