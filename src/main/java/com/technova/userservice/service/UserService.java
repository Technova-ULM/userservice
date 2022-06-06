package com.technova.userservice.service;

import com.technova.userservice.dto.UserRequest;
import com.technova.userservice.model.User;
import com.technova.userservice.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public User createUser(UserRequest userRequest) {
        User user= User.builder().email(userRequest.getEmail()).firstName(userRequest.getFirstName()).lastName(userRequest.getLastName()).build();
        return userRepository.save(user);
    }
}
