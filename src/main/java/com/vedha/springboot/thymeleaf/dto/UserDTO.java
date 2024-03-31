package com.vedha.springboot.thymeleaf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long Id;

    private String userName;

    private String userEmail;

    private String userGender;

    private String userRole;
}
