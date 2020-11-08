package com.example.demoUser.dao;

import com.example.demoUser.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {
}

