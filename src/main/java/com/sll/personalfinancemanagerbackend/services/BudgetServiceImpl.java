package com.sll.personalfinancemanagerbackend.services;

import com.sll.personalfinancemanagerbackend.entities.Budget;
import com.sll.personalfinancemanagerbackend.repositories.BudgetRepository;

import java.util.List;


public class BudgetServiceImpl implements BudgetService {
    private BudgetRepository budgetRepository;


    @Override
    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    @Override
    public Budget getBudgetById(int id) {
        return budgetRepository.findById(id).orElse(null);
    }

    @Override
    public Budget addBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    @Override
    public Budget updateBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    @Override
    public void deleteBudget(int id) {
        budgetRepository.deleteById(id);

    }
}
