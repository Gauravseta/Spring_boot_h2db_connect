package com.example.gs.controller;

import com.example.gs.entities.User;
import com.example.gs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUser(@PathVariable int id) throws Exception {
        Optional<User> userOpt = this.userService.findById(id);
        if(userOpt.isEmpty()) {
            throw new Exception("No such user present");
        }
        return ResponseEntity.ok(userOpt.get());
    }
}
