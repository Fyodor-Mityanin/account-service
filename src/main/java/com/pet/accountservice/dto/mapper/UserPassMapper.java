package com.pet.accountservice.dto.mapper;

import com.pet.accountservice.dto.UserPassDTO;
import com.pet.accountservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserPassMapper {
    public User DTOToEntity (UserPassDTO userPassDTO) {
        User user = new User();
        user.setName(userPassDTO.getName());
        user.setLastname(userPassDTO.getLastname());
        user.setEmail(userPassDTO.getEmail());
        user.setPassword(userPassDTO.getPassword());
        return user;
    }
}
