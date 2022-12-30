package com.sudproject.expenseapi.repositories;


import com.sudproject.expenseapi.domain.User;
import com.sudproject.expenseapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
