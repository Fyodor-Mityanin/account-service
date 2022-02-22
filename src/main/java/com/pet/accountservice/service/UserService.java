package com.pet.accountservice.service;

import com.pet.accountservice.dto.UserDTO;
import com.pet.accountservice.dto.UserPassDTO;
import com.pet.accountservice.dto.mapper.UserMapper;
import com.pet.accountservice.dto.mapper.UserPassMapper;
import com.pet.accountservice.entity.User;
import com.pet.accountservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;
    UserPassMapper userPassMapper;
    UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserPassMapper userPassMapper, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userPassMapper = userPassMapper;
        this.userMapper = userMapper;
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User mapToUser(UserPassDTO userPassDTO) {
        return userPassMapper.DTOToEntity(userPassDTO);
    }

    public UserDTO mapToDTO(User user) {
        return userMapper.entityToDTO(user);
    }

    public User saveUserDTO (UserPassDTO userPassDTO) {
        User user = userPassMapper.DTOToEntity(userPassDTO);
        return userRepository.save(user);
    }
}
