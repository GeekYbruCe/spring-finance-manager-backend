package com.sll.personalfinancemanagerbackend.repositories;

import com.sll.personalfinancemanagerbackend.entities.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Integer> {
    public Budget findByName(String name);

}
