package com.insurancemanagementplatform.controller;

import com.insurancemanagementplatform.entity.User;
import com.insurancemanagementplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class UserApiController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(){
        return "Hello String";
    }

    @GetMapping("")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("")
    public User adduser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId, @RequestBody User user){
        user.setId(userId);
        User updatedUser = userService.updateUser(user);

        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
        User user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User Successfully deleted!", HttpStatus.OK);
    }

}
