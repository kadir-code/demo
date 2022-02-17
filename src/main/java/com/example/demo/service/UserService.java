package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    boolean signIn(User user);
    boolean signOut(User user);
    List<User> findAll();
    User create(User user);
}
