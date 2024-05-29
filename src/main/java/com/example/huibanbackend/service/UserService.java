package com.example.huibanbackend.service;

import com.example.huibanbackend.entity.User;

public interface UserService {
    User findUserById(Long id);

    User saveUser(User user);
}
