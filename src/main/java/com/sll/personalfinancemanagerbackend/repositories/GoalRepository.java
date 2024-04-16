package com.sll.personalfinancemanagerbackend.repositories;

import com.sll.personalfinancemanagerbackend.entities.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface GoalRepository extends JpaRepository<Goal, Integer> {
    Goal findByName(String name);

}
