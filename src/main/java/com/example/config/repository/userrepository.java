package com.example.config.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.config.example.db.databaseconnection;

@Repository
public class userrepository {

    private databaseconnection db;

    public userrepository(databaseconnection db) {
        this.db = db;
    }

    public List<String> findAll() {
        return db.getUsers();
    }

    public void addUser(String user) {
        db.addUser(user);
    }
}