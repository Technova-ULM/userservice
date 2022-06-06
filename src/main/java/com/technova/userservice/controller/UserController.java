package com.technova.userservice.controller;

import com.technova.userservice.Response.ApiResponse;
import com.technova.userservice.Response.AppContants;
import com.technova.userservice.dto.UserRequest;
import com.technova.userservice.model.User;
import com.technova.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {

    @GetMapping("/message")
    public String hello(){
        return "Hello world";
    }

    @Autowired
    private UserService userService;

    @PostMapping(AppContants.USERURL)
    public ResponseEntity<Object> createUser(@RequestBody @Valid UserRequest userRequest){
        User user= userService.createUser(userRequest);
        return ApiResponse.generateResponse(HttpStatus.OK,AppContants.SUCCESS,user,null);

    }

}
