package com.example.demoUser.controllers;

import com.example.demoUser.model.User;
import com.example.demoUser.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Users {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/addUser")
    public String saveUser(@RequestBody User user) {
        userRepository.save(user);
        return "Added User with id : " + user.toString();
    }

    @GetMapping("/findAllUser")
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @GetMapping("/findAllUser/{id}")
    public Optional<User> getUser(@PathVariable int id) {
        return userRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userRepository.deleteById(id);
        return "User deleted with id : " + id;
    }
}
