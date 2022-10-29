package com.backend.demo.service;

import com.backend.demo.model.User;

import java.util.List;

public interface UserService {

    public User addUser(User user);

    public List<User> getUsers();

    public User getUser(Long userId);

    public User updateUser(User user);

   public User deleteUser(Long userId);
}
