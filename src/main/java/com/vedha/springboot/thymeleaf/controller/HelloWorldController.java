package com.vedha.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    /**
        Handler Methods
    **/

    // http://localhost:8080/helloWorld
    @GetMapping("/helloWorld")
    public String handleHelloWorld(Model model) {

        model.addAttribute("message", "HelloWorld!!");

        return "hello-world";
    }
}
