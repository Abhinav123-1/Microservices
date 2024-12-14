package com.aspq.user.userservice.service;

import com.aspq.user.userservice.entity.User;

import java.util.List;

public interface UserService {
   //CREATE
    User save(User user);
    //GET ALL USER
    List<User> getAllUsers();
    //GET USERS BASED ON USERID
    User getUserById(String userID);

}
