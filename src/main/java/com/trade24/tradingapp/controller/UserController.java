package com.trade24.tradingapp.controller;

import com.trade24.tradingapp.entity.User;
import com.trade24.tradingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    public void updateUser(Long id, User user) {

    }
    public void deleteUser(Long id) {

    }
}
