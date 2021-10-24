package com.buyzon.userservice.controller;

import com.buyzon.userservice.model.User;
import com.buyzon.userservice.repository.UserRepository;
import com.buyzon.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @CrossOrigin
    @PostMapping("/")
    public User createUser(@Valid @RequestBody User user) {
        return userService.createUser(user);
    }

}
