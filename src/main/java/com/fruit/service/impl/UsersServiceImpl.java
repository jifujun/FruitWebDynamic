package com.fruit.service.impl;

import com.fruit.dao.UsersDao;
import com.fruit.model.Users;
import com.fruit.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 快乐的小菌菌 on 2017/6/27.
 */
@Service
public class UsersServiceImpl implements UsersService {
    private UsersDao usersDao;

    public UsersDao getUsersDao() {
        return usersDao;
    }

    @Resource
    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Transactional
    @Override
    public void userRegister(Users users) {
        usersDao.userRegister(users);
    }

    @Override
    public void userUpdate() {

    }

    @Override
    public List<Users> userIsExist(String phone, String password) {
        return usersDao.userIsExist(phone,password);
    }
}
