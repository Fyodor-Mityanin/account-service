package com.pet.accountservice.controller;

import com.pet.accountservice.entity.User;
import com.pet.accountservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("admin/users")
    public ResponseEntity<List<User>> getUsers(HttpServletRequest httpServletRequest) {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }


}
