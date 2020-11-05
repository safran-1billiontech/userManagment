package com.example.demoUser.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "Users")
public class User {
    @Id
    private int id;
    private String username;
    private int age;
}
