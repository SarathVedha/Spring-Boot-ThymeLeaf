package com.vedha.springboot.thymeleaf.controller;

import com.vedha.springboot.thymeleaf.dto.UserDTO;
import com.vedha.springboot.thymeleaf.dto.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    // http://localhost:8080/variable
    @GetMapping("/variable")
    public String handleUserDataVariable(Model model) {

        UserDTO userDTO = new UserDTO(
                1L,
                "Vedha",
                "vedha@gmail.com",
                "Male",
                "ADMIN"
        );

        model.addAttribute("user", userDTO);

        return "variable";
    }

    // http://localhost:8080/selection
    @GetMapping("/selection")
    public String handleUserSelection(Model model) {

        UserDTO userDTO = new UserDTO(
                1L,
                "Vedha2",
                "vedha2@gmail.com",
                "Male",
                "ADMIN"
        );

        model.addAttribute("user", userDTO);

        return "selection";
    }

    // http://localhost:8080/message
    @GetMapping("/message")
    public String handleMessage() {

        return "message";
    }

    // http://localhost:8080/link
    @GetMapping("/link")
    public String handleLink(Model model) {

        model.addAttribute("id", "Vedha");

        return "link";
    }

    // http://localhost:8080/fragment
    @GetMapping("/fragment")
    public String handleFragment() {

        return "fragment";
    }

    // http://localhost:8080/loop
    @GetMapping("/loop")
    public String handleLoop(Model model) {

        UserDTO userDTO = new UserDTO(1L, "Vedha1", "vedha1@gmail.com", "Male", "ADMIN");

        UserDTO userDTO1 = new UserDTO(2L, "Vedha2", "Vedha2@gmail.com", "Male", "USER");

        UserDTO userDTO2 = new UserDTO(3L, "Vedha3", "vedha3@gmail.com", "Male", "USER");

        UserDTO userDTO3 = new UserDTO(4L, "Vedha4", "vedha4@gmail.com", "Male", "ADMIN");

        List<UserDTO> userDTOS = new ArrayList<>();
        userDTOS.add(userDTO);
        userDTOS.add(userDTO1);
        userDTOS.add(userDTO2);
        userDTOS.add(userDTO3);

        model.addAttribute("users", userDTOS);

        return "loop";
    }

    // http://localhost:8080/if-unless
    @GetMapping("/if-unless")
    public String handleIfUnless(Model model) {

        UserDTO userDTO = new UserDTO(1L, "Vedha1", "vedha1@gmail.com", "Male", "ADMIN");

        UserDTO userDTO1 = new UserDTO(2L, "Vedha2", "Vedha2@gmail.com", "Male", "USER");

        UserDTO userDTO2 = new UserDTO(3L, "Vedha3", "vedha3@gmail.com", "Male", "USER");

        UserDTO userDTO3 = new UserDTO(4L, "Vedha4", "vedha4@gmail.com", "Male", "ADMIN");

        List<UserDTO> userDTOS = new ArrayList<>();
        userDTOS.add(userDTO);
        userDTOS.add(userDTO1);
        userDTOS.add(userDTO2);
        userDTOS.add(userDTO3);

        model.addAttribute("users", userDTOS);

        return "if-unless";
    }

    // http://localhost:8080/switch-case
    @GetMapping("/switch-case")
    public String handleSwitchCase(Model model) {

        UserDTO userDTO = new UserDTO(1L, "Vedha1", "vedha1@gmail.com", "Male", "ADMIN");

        model.addAttribute("user", userDTO);

        return "switch-case";
    }

}
