package com.pet.accountservice.controller;

import com.pet.accountservice.dto.UserDTO;
import com.pet.accountservice.dto.UserPassDTO;
import com.pet.accountservice.entity.User;
import com.pet.accountservice.exeptions.UserSaveException;
import com.pet.accountservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;


@Controller
@RequestMapping("/auth")
public class AuthenticationController {

    UserService userService;

    @Autowired
    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> singUp(@RequestBody UserPassDTO userPassDTO, HttpServletRequest httpServletRequest) {
        try {
            User user = userService.saveUserDTO(userPassDTO);
            UserDTO userDTO = userService.mapToDTO(user);
            return ResponseEntity.ok(userDTO);
        } catch (Exception e) {
            throw new UserSaveException();
//            final LocalDate date = LocalDate.now();
//            final Integer status = HttpStatus.BAD_REQUEST.value();
//            final String error = HttpStatus.BAD_REQUEST.toString();
//            final String path = httpServletRequest.getRequestURI();
//            Map<String, Object> response = new LinkedHashMap<>();
//            response.put("timestamp", date);
//            response.put("status",  status);
//            response.put("error", error);
//            response.put("path", path);
//            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }


}
