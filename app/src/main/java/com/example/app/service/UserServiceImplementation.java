package com.example.app.service;

import com.example.app.model.User;
import com.example.app.repository.UserReporitory;

public class UserServiceImplementation implements UserServiceInterface {

    private UserReporitory userReporitory;

    @Override
    public User createUser(User user) {
        return userReporitory.save(user);
    }

}
