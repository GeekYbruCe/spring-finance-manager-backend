package com.sll.personalfinancemanagerbackend.repositories;

import com.sll.personalfinancemanagerbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
