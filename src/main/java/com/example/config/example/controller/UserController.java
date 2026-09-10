package com.example.config.example.controller;

import org.springframework.stereotype.Controller;
import com.example.config.service.UserService;
import java.util.List;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void createUser(String name) {
        userService.addUser(name);
        System.out.println("user added " + name);
    }

    public void listUser() {
        List<String> users = userService.getAllUsers();
        System.out.println("All users: " + users);
    }
}