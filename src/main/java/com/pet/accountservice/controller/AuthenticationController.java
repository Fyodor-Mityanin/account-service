package com.pet.accountservice.controller;

import com.pet.accountservice.dto.UserDTO;
import com.pet.accountservice.dto.UserPassDTO;
import com.pet.accountservice.entity.User;
import com.pet.accountservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/auth")
public class AuthenticationController {

    UserService userService;

    @Autowired
    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<UserDTO> singUp(@RequestBody UserPassDTO userPassDTO) {
        User user = userService.saveUserDTO(userPassDTO);
        UserDTO userDTO = userService.mapToDTO(user);
        return ResponseEntity.ok(userDTO);
    }


}
