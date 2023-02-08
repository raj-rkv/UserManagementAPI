package com.example.usermanagementsystem.controller;

import com.example.usermanagementsystem.model.User;
import com.example.usermanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user-management-app")
public class UserController {

    @Autowired
    private UserService userService;

    //Create
    @PostMapping("add-user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping("get-user/userid/{userid}")
    public User getUserById(@PathVariable int userid)
    {
        return userService.getUserById(userid);
    }

    @GetMapping("get-all-user")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PutMapping("update-user/userid/{userid}")
    public void updateUser(@PathVariable int userid, @RequestBody User user)
    {
        userService.updateUserById(userid,user);
    }

    @DeleteMapping("delete-user/userid/{userid}")
    public void deleteUser(@PathVariable int userid){
        userService.deleteUser(userid);
    }
}
