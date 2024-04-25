package com.library.service;

import java.util.List;
import java.util.Optional;

import com.library.dto.CategoryDto;
import com.library.model.Category;

public interface CategoryService {
    Category save(Category category);

    Category update(Category category);

    List<Category> findAllByActivatedTrue();

    List<Category> findALl();

    Optional<Category> findById(Long id);

    void deleteById(Long id);

    void enableById(Long id);

    List<CategoryDto> getCategoriesAndSize();
}
