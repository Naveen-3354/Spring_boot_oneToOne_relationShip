package com.example.Onetone.service;

import com.example.Onetone.model.User;
import com.example.Onetone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long userId) {
        return userRepository.findById(userId).get();
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
