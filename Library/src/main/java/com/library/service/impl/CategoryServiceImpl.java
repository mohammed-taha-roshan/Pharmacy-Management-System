package com.library.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.library.dto.CategoryDto;
import com.library.model.Category;
import com.library.repository.CategoryRepository;
import com.library.service.CategoryService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        Category categoryToSave = Category.builder()
                .name(category.getName())
                .activated(true)
                .deleted(false)
                .build();
        return categoryRepository.save(categoryToSave);

    }

    @Override
    public Category update(Category category) {
        Category categoryUpdate = categoryRepository.getReferenceById(category.getId());
        categoryUpdate.setName(category.getName());
        return categoryRepository.save(categoryUpdate);
    }

    @Override
    public List<Category> findAllByActivatedTrue() {
        return categoryRepository.findAllByActivatedTrue();
    }

    @Override
    public List<Category> findALl() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        Category category = categoryRepository.getById(id);
        category.setActivated(false);
        category.setDeleted(true);
        categoryRepository.save(category);
    }

    @Override
    public void enableById(Long id) {
        Category category = categoryRepository.getById(id);
        category.setActivated(true);
        category.setDeleted(false);
        categoryRepository.save(category);
    }

    @Override
    public List<CategoryDto> getCategoriesAndSize() {
        List<CategoryDto> categories = categoryRepository.getCategoriesAndSize();
        return categories;
    }

}


