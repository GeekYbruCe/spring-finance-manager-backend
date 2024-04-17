package com.sll.personalfinancemanagerbackend.api.controller;

import com.sll.personalfinancemanagerbackend.entities.Budget;
import com.sll.personalfinancemanagerbackend.services.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budget")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;
    @Autowired
    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping
    public ResponseEntity<List<Budget>> getAllBudgets() {
        List<Budget> budgets = budgetService.getAllBudgets();
        return ResponseEntity.ok().body(budgets);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Budget> getBudgetById(@PathVariable Long id) {
        Budget budget = budgetService.getBudgetById(id);
        return ResponseEntity.ok().body(budget);
    }

    @PostMapping
    public ResponseEntity<Budget> createBudget(@RequestBody Budget budget) {
        Budget savedBudget = budgetService.addBudget(budget);
        return ResponseEntity.ok().body(savedBudget);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Budget> deleteBudgetById(@PathVariable Long id) {
        Budget budget = budgetService.getBudgetById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Budget> updateBudgetById(@RequestBody Budget budget) {
         Budget updated = budgetService.updateBudget(budget);
         return ResponseEntity.ok().body(updated);
    }
}