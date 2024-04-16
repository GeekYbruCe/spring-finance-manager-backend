package com.sll.personalfinancemanagerbackend.services;

import com.sll.personalfinancemanagerbackend.entities.Goal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoalService{
    List<Goal> getAllGoals();
    Goal getGoalById(int id);
    Goal addGoal(Goal goal);
    Goal updateGoal(Goal goal);
    void deleteGoal(int id);
    void saveGoal(Goal goal);
    void deleteAllGoals();
    Goal getGoalByName(String name);

}

