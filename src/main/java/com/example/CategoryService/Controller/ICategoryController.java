package com.example.CategoryService.Controller;


import com.example.CategoryService.DTO.ResponeCategoryDTO;
import com.example.CategoryService.Entity.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/category")
public interface ICategoryController {
    @GetMapping("/getCategoryById/{id}")
    public ResponeCategoryDTO getCategoryById(@PathVariable int id);
}
