package com.sudproject.expenseapi.services;


import com.sudproject.expenseapi.domain.User;
import com.sudproject.expenseapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
