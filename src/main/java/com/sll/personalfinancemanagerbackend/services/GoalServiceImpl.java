package com.sll.personalfinancemanagerbackend.services;

import com.sll.personalfinancemanagerbackend.entities.Goal;
import com.sll.personalfinancemanagerbackend.repositories.GoalRepository;

import java.util.List;

public class GoalServiceImpl implements GoalService {
    private GoalRepository goalRepository;
    @Override
    public List<Goal> getAllGoals() {
        return goalRepository.findAll();
    }

    @Override
    public Goal getGoalById(int id) {
        return goalRepository.findById(id).orElse(null);
    }

    @Override
    public Goal addGoal(Goal goal) {
        return goalRepository.save(goal);
    }

    @Override
    public Goal updateGoal(Goal goal) {
        return goalRepository.save(goal);
    }

    @Override
    public void deleteGoal(int id) {
        goalRepository.deleteById(id);

    }

    @Override
    public void saveGoal(Goal goal) {
        goalRepository.save(goal);

    }

    @Override
    public void deleteAllGoals() {
        goalRepository.deleteAll();

    }

    @Override
    public Goal getGoalByName(String name) {
        return goalRepository.findByName(name);
    }
}
