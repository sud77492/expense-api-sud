package com.sudproject.expenseapi.services;

import com.sudproject.expenseapi.domain.Category;
import com.sudproject.expenseapi.exceptions.EtBadRequestException;
import com.sudproject.expenseapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategorywithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
