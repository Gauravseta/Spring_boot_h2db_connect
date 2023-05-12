package com.example.gs.services;

import com.example.gs.entities.User;
import com.example.gs.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserService() {
    }

    public void save(User u) {
        this.userRepository.save(u);
    }

    public Optional<User> findById(int id) {
        Optional<User> userOpt = this.userRepository.findById(id);
        return userOpt;
    }
}
