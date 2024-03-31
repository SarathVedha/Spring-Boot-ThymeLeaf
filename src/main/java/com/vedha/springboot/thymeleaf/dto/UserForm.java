package com.vedha.springboot.thymeleaf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {

    private String userName;

    private String userEmail;

    private String userPassword;

    private String userGender;

    private String userAddress;

    private boolean isMarried;

    private String userProfession;
}
