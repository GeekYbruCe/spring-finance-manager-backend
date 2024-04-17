package com.sll.personalfinancemanagerbackend.api.controller;

import com.sll.personalfinancemanagerbackend.entities.Budget;
import com.sll.personalfinancemanagerbackend.entities.Category;
import com.sll.personalfinancemanagerbackend.services.BudgetService;
import com.sll.personalfinancemanagerbackend.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        Category savedCategory = categoryService.createCategory(category);
        return ResponseEntity.ok().body(savedCategory);

    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = categoryService.getAllCategories();
        return ResponseEntity.ok().body(categories);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        Category category = categoryService.getCategoryById(id);
        return ResponseEntity.ok().body(category);
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category) {
        Category updated = categoryService.updateCategory(category);
        return ResponseEntity.ok().body(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Category> deleteCategory(@PathVariable Long id) {
        Category category = categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }

}
