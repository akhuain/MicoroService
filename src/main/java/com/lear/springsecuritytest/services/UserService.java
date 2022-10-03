package com.lear.springsecuritytest.services;

import com.lear.springsecuritytest.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {

    // get all users
    List<User> usersList = new ArrayList<>();

    public UserService(){
        usersList.add(new User("Ram","ram1234","ram@333gmail.com"));
        usersList.add(new User("Aalam","Alam1234","Alam@333gmail.com"));
    }


    public List<User> getAllUser(){
        return this.usersList;
    }

    public User getUserbyID(String userName){
        return this.usersList.stream().filter(usersList->usersList.getUsername().equals(userName)).findAny().orElse(null);
    }

    public  User adduser(User userObject){
      this.usersList.add(userObject);
        return userObject;

    }
}
