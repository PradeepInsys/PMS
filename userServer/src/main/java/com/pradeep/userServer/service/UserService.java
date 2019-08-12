package com.pradeep.userServer.service;

import com.pradeep.userServer.entity.User;

public interface UserService {

    User registerUser(User input);

    Iterable<User> findAll();

    User findById(Long id);
}
