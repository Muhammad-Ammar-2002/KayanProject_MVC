package com.ebi.kayanProject.controller;

import com.ebi.kayanProject.model.LoginUserDto;
import com.ebi.kayanProject.model.UserDto;
import com.ebi.kayanProject.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logIn")
public class UserLogInController {

    private final UserService userService;

    public UserLogInController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public String loginUser() {

        return "login";
    }

    @PostMapping
    public String loginUser(@ModelAttribute LoginUserDto loginUserDto) {
        userService.LoginUser(loginUserDto);
        return "redirect:/home";
    }
}






