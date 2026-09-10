package com.example.config.example.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class databaseconnection {

    private List<String> users;

    @PostConstruct
    public void init() {
        users = new ArrayList<>();
        System.out.println("db connected");
    }

    public List<String> getUsers() {
        return users;
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("db disconnected");
    }
    public void addUser(String user) {
        users.add(user);
    }
}