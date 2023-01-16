package com.trade24.tradingapp.controller;

import com.trade24.tradingapp.entity.Category;
import com.trade24.tradingapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3333", maxAge = 3600)
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/getAll")
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @GetMapping("/get/{id}")
    public Category getById(@PathVariable Long id) {
        return this.categoryService.getById(id);
    }

    @PostMapping("/add")
    Category addCategory(@RequestBody Category category) {
        return this.categoryService.addCategory(category);
    }

    public void deleteCategory(Long id) {

    }
}
