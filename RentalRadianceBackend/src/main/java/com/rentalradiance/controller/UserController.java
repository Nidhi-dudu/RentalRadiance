package com.rentalradiance.controller;

import com.rentalradiance.model.User;
import com.rentalradiance.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.registerUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        boolean success = service.login(user.getEmail(), user.getPassword());
        return success ? "Login successful" : "Invalid credentials";
    }
}
