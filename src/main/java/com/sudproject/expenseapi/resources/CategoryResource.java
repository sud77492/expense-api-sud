package com.sudproject.expenseapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/categories")
public class CategoryResource {

    @GetMapping("")
    public String getAllCategories(HttpServletRequest request){
//        return "Authenticate! UserId: ";
        int userId = (Integer) request.getAttribute("userId");
        return "Authenticate! UserId: "+ userId;
    }
}
