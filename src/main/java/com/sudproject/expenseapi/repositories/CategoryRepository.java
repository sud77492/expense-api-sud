package com.sudproject.expenseapi.repositories;

import com.sudproject.expenseapi.domain.Category;
import com.sudproject.expenseapi.exceptions.EtBadRequestException;
import com.sudproject.expenseapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {
    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer usereId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);
}
