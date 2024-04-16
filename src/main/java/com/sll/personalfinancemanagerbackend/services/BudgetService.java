package com.sll.personalfinancemanagerbackend.services;
import com.sll.personalfinancemanagerbackend.entities.Budget;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BudgetService {
    List<Budget> getAllBudgets();
    Budget getBudgetById(int id);
    Budget addBudget(Budget budget);
    Budget updateBudget(Budget budget);
    void deleteBudget(int id);

}
