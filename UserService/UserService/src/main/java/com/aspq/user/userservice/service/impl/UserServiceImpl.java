package com.aspq.user.userservice.service.impl;

import com.aspq.user.userservice.entity.User;
import com.aspq.user.userservice.exceptions.ResourceNotFoundException;
import com.aspq.user.userservice.repository.UserRepository;
import com.aspq.user.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        //genertae Unique UserID
        String userId = UUID.randomUUID().toString();
        user.setUserID(userId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String userID) {
        return userRepository.findById(userID).orElseThrow(()->new ResourceNotFoundException("User not found"));
    }

}
