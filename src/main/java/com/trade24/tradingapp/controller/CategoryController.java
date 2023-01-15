package com.trade24.tradingapp.controller;

import com.trade24.tradingapp.entity.Category;
import com.trade24.tradingapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("")
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    Category getById(Long id) {
        return null;
    }

    void addCategory(Category category) {

    }

    void updateCategory(Long id, Category category) {

    }

    void deleteCategory(Long id) {

    }
}
