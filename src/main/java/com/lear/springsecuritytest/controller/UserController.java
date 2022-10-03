package com.lear.springsecuritytest.controller;

import com.lear.springsecuritytest.models.User;
import com.lear.springsecuritytest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getallUsers() {
               List<User> userResponse =  userService.getAllUser();
        return ResponseEntity.of(Optional.of(userResponse));
    }
    @GetMapping("singleuser/{username}")
    public  User getSingleUser(@PathVariable("username") String user){
        return this.userService.getUserbyID(user);
    }
    @PostMapping("/add")
    public void adduser(@RequestBody User user){
        userService.adduser(user);

    }
}
