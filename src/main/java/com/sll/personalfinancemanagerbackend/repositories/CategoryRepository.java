package com.sll.personalfinancemanagerbackend.repositories;

import com.sll.personalfinancemanagerbackend.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

}
