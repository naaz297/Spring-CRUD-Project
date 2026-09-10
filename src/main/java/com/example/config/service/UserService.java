package com.example.config.service;

import org.springframework.stereotype.Service;
import com.example.config.repository.userrepository;
import java.util.List;
@Service
public class UserService {

    private userrepository userRepository;

    public UserService(userrepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(String name) {
        userRepository.addUser(name);
    }

    public List<String> getAllUsers() {
        return userRepository.findAll();
    }
}