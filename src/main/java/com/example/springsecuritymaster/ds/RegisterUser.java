package com.example.springsecuritymaster.ds;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class RegisterUser {

    @NotBlank(message = "User Name cannot be null.")
    @Pattern(regexp = "[A-Za-z0-9 ]*",message = "Username cannot contain illegal characters.")
    private String userName;
    @NotBlank(message = "Password cannot be null.")
    @Pattern(regexp = "[A-Za-z0-9]*",message = "Password cannot contain illegal characters")
    private String password;
    @NotBlank(message = "RepeatedPassword cannot be null.")
    @Pattern(regexp = "[A-Za-z0-9]*",message = "Repeated Password cannot contain illegal characters.")
    private String repeatedPassword;
}
