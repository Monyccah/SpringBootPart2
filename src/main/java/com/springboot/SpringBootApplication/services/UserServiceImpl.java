package com.springboot.SpringBootApplication.services;


import com.springboot.SpringBootApplication.model.User;
import com.springboot.SpringBootApplication.repo.FakeRepo;
import com.springboot.SpringBootApplication.repo.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class UserServiceImpl {

    @Autowired
    private FakeRepo fakeRepoInterface;


    public void addUser(String name, String surname) {

        fakeRepoInterface.insertUser(name, surname);
        System.out.println(name +" "+ "entered");
    }


    public void removeUser(long id) {
        User user = fakeRepoInterface.findUserById(id);
        if (user != null){
            fakeRepoInterface.deleteUser(id);
            System.out.println(user.getName() +" "+ "removed");
        }

    }



    @Cacheable("user")
    public User getUser(long id) {
            try
            {
                System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
                Thread.sleep(1000*5);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
    //    }
        return new User(id, "Monica", "Hello");
    }
}
