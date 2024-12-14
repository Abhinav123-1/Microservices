package com.aspq.user.userservice.controller;

import com.aspq.user.userservice.entity.User;
import com.aspq.user.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //create
    @PostMapping
    //RequestBody Will Deseralize in User
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User userNew = userService.save(user);
        return ResponseEntity.ok(userNew);
    }

    //single User
    @GetMapping("/{userID}")
    public ResponseEntity<User> getUsers(@PathVariable String userID) {
        return ResponseEntity.ok(userService.getUserById(userID));
    }

    //All user
    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

}
