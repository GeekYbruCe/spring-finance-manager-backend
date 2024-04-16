package com.sll.personalfinancemanagerbackend.services;

import com.sll.personalfinancemanagerbackend.entities.User;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    User getUserById(Long id);
    User getUserByEmail(String email);
    User getUserByUsername(String username);
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(int id);
}
