package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private  final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    @ResponseBody
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping
    @ResponseBody
    public User createUser(@RequestBody User user){
        return userService.create(user);
    }
}
