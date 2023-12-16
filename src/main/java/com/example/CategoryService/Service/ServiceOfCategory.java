package com.example.CategoryService.Service;


import com.example.CategoryService.Config.ModelMapperObject;
import com.example.CategoryService.DTO.ResponeCategoryDTO;
import com.example.CategoryService.Entity.Category;
import com.example.CategoryService.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ServiceOfCategory implements ICategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ModelMapperObject modelMapperObject;


    @Override
    public ResponeCategoryDTO findCategoryById(int id) {
        return modelMapperObject.modelMapper().map(categoryRepository.findById(id).orElseThrow(), ResponeCategoryDTO.class) ;
    }
}
