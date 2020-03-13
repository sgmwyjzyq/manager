package com.sgm.web.controller;

import com.sgm.pojo.User;
import com.sgm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author SGM
 * @Date 2020/3/12 17:22
 * @Version V1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    public UserService userService;

    @RequestMapping("/addUser")
    public String addUser(User user){
        user.setUserState(1);
        userService.addUser(user);
        return "ok";
    }
}
