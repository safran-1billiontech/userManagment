package com.example.demoUser.service.impl;

import com.example.demoUser.dao.UserRepository;
import com.example.demoUser.model.User;
import com.example.demoUser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public String saveUser(User user) {
        userRepository.save(user);
        return "Saved user : "+user.toString();
    }

}
