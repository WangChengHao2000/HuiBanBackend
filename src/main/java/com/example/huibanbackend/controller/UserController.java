package com.example.huibanbackend.controller;

import com.example.huibanbackend.entity.User;
import com.example.huibanbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/findUserById")
    public User findUserById(Long id) {
        return userService.findUserById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/saveUser")
    public User saveUser(User user) {
        return userService.saveUser(user);
    }

}
