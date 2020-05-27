package com.springboot.SpringBootApplication.repo;

import com.springboot.SpringBootApplication.model.User;

public interface FakeRepoInterface {

    void insertUser( String name, String surname);
    User findUserById(long id);
    void deleteUser(long id);
}
