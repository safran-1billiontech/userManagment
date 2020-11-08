package com.example.demoUser.controller;

import com.example.demoUser.model.User;
import com.example.demoUser.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping("/addUser")
    public String saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

//    @GetMapping("/findAllUser")
//    public List<User> getUser() {
//        return userRepository.findAll();
//    }
//
//    @GetMapping("/findAllUser/{id}")
//    public Optional<User> getUser(@PathVariable int id) {
//        return userRepository.findById(id);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteUser(@PathVariable int id) {
//        userRepository.deleteById(id);
//        return "User deleted with id : " + id;
//    }
}
