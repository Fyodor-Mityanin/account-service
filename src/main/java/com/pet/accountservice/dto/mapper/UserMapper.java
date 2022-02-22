package com.pet.accountservice.dto.mapper;

import com.pet.accountservice.dto.UserDTO;
import com.pet.accountservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserMapper {

    public UserDTO entityToDTO (User user) {
        return new UserDTO(
                user.getName(),
                user.getLastname(),
                user.getEmail(),
                user.getPassword()
        );
    }


    public List<UserDTO> entitiesToDTOs (List<User> codeList) {
        List<UserDTO> codeDTOs = new ArrayList<>();
        for (User user: codeList) {
            UserDTO dto = entityToDTO(user);
            codeDTOs.add(dto);
        }
        return codeDTOs;
    }
}
