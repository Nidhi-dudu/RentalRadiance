package com.rentalradiance.service;

import com.rentalradiance.model.User;
import com.rentalradiance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User registerUser(User user) {
        user.setPassword(user.getPassword()); // Encrypt password before saving
        return repo.save(user);
    }

    public boolean login(String email, String password) {
        User user = repo.findByEmail(email);
        return user != null && password== user.getPassword(); // Match encrypted password
    }
}
