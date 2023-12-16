package com.example.CategoryService.Service;


import com.example.CategoryService.DTO.ResponeCategoryDTO;
import com.example.CategoryService.Entity.Category;

public interface ICategoryService {
    ResponeCategoryDTO findCategoryById(int id);
}
