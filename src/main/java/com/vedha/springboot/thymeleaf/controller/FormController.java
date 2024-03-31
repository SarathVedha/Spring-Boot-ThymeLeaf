package com.vedha.springboot.thymeleaf.controller;

import com.vedha.springboot.thymeleaf.dto.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    // http://localhost:8080/user-form
    @GetMapping("/user-form")
    public String handleUserForm(Model model) {

        UserForm userForm = new UserForm();

        model.addAttribute("userForm", userForm);

        List<String> professions = Arrays.asList("Developer", "Tester", "SME");

        model.addAttribute("professions", professions);

        return "user-form";
    }

    // http://localhost:8080/registerUser
    @PostMapping("/registerUser")
    public String submitForm(Model model, @ModelAttribute("userForm") UserForm userForm) {

        model.addAttribute("getUser", userForm);

        return "registered-user";
    }
}
