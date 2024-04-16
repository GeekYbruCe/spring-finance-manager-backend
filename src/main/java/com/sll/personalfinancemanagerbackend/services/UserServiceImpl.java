package com.sll.personalfinancemanagerbackend.services;

import com.sll.personalfinancemanagerbackend.entities.User;
import com.sll.personalfinancemanagerbackend.repositories.UserRepository;

import java.util.List;


public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();

    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User getUserByEmail(String email) {
        return getUserByEmail(email);
    }

    @Override
    public User getUserByUsername(String username) {
        return getUserByUsername(username);
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
