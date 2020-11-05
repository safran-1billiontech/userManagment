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
    public String saveBook(@RequestBody User user) {
        userRepository.save(user);
        return "Added User with id : " + user.toString();
    }

    @GetMapping("/findAllBooks")
    public List<User> getBooks() {
        return userRepository.findAll();
    }

    @GetMapping("/findAllBooks/{id}")
    public Optional<User> getBook(@PathVariable int id) {
        return userRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        userRepository.deleteById(id);
        return "book deleted with id : " + id;
    }
}
