package com.example.CategoryService.Controller;

import com.example.CategoryService.DTO.ResponeCategoryDTO;
import com.example.CategoryService.Entity.Category;
import com.example.CategoryService.Service.ServiceOfCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController implements ICategoryController{

    @Autowired
    ServiceOfCategory serviceOfCategory;

    @Override
    public ResponeCategoryDTO getCategoryById(int id) {
        return serviceOfCategory.findCategoryById(id);
    }
}
