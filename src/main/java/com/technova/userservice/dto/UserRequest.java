package com.technova.userservice.dto;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
public class UserRequest {

    @NotNull(message = "first name cannot be null")
    @NotBlank(message = "first name cannot be blank")
    @Size(min = 3, max = 8)
    private String firstName;

    @NotNull(message="lastname cannot be null")
    @NotBlank(message = "lastname cannot be blank")
    private String lastName;

    @NotNull(message = "email cannot be null")
    @NotBlank(message = "lastname cannot be blank")
    @Email()
    private String email;


}
