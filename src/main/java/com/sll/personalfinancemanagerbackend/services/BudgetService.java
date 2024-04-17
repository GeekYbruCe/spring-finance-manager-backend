package com.sll.personalfinancemanagerbackend.services;
import com.sll.personalfinancemanagerbackend.entities.Budget;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BudgetService {
    List<Budget> getAllBudgets();
    Budget getBudgetById(Long id);
    Budget addBudget(Budget budget);
    Budget updateBudget(Budget budget);
    void deleteBudget(Long id);

}
