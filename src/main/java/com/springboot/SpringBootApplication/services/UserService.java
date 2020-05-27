package com.springboot.SpringBootApplication.services;

import com.springboot.SpringBootApplication.model.User;

public interface UserService {
    void addUser(String name, String surname);
    void removeUser(long id);
    User getUser(long id);
}
