package com.backend.demo.controller;

import com.backend.demo.model.User;
import com.backend.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return this.userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id){
        return userService.getUser(Long.parseLong(id));
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        return this.userService.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable String id){
        return this.userService.deleteUser(Long.parseLong(id));
    }
}
