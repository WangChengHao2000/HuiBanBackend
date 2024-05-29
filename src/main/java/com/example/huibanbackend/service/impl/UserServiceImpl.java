package com.example.huibanbackend.service.impl;

import com.example.huibanbackend.entity.User;
import com.example.huibanbackend.repository.UserRepository;
import com.example.huibanbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(new User());
    }

    @Override
    public User saveUser(User user) {
        if (user.getId() != null)
            return userRepository.save(user);

        long count = userRepository.count();
        user.setId(count);
        return userRepository.save(user);
    }
}
