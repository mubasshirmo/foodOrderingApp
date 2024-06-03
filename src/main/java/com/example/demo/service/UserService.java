package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {

    public User findUserByJwtToken(String jwt)throws Exception;

    public User findUserByEmail(String email)throws Exception;
}
