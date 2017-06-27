package com.fruit.controller;

import com.fruit.model.Users;
import com.fruit.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * 用户的所有行为都在此Controller里进行
 * Created by 快乐的小菌菌 on 2017/6/27.
 */
@Controller
public class UsersController {
    private UsersService usersService;

    public UsersService getUsersService() {
        return usersService;
    }

    @Resource
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    /**
     * 用户注册
     */
    @RequestMapping(value = "/register")
    @ResponseBody
    public String register(@RequestBody Users u) {
        System.out.println(u.getEmail());
        System.out.println(u.getName());
        System.out.println(u.getPassword());
        Users users = new Users();
        users.setId(UUID.randomUUID().toString());
        users.setEmail(u.getEmail());
        users.setName(u.getName());
        users.setPhone(u.getPhone());
        users.setPassword(u.getPassword());
        usersService.userRegister(users);
        return "success";
    }

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(@RequestBody Users u) {
        if (usersService.userIsExist(u.getPhone(), u.getPassword()) != null) {
            return "success";
        }
        System.out.println(u.getPhone());
        System.out.println(u.getPassword());
        return "error";
    }
}
