package com.ebi.kayanProject.controller;

import com.ebi.kayanProject.model.LoginUserDto;
import com.ebi.kayanProject.model.UserDto;
import com.ebi.kayanProject.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserControllerAPI {
    private final UserService userService;

    public UserControllerAPI(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/signup")
//    public String registerUser(Model model) {
//        model.addAttribute("user", new UserDto());
//        return"#";
//    }
    @PostMapping
    public UserDto registerUser(@RequestBody UserDto userDto) {

        return userService.RegisterUser(userDto);
    }

//    @GetMapping("/login")
//    public  String loginUser(Model model) {
//        model.addAttribute("user", new LoginUserDto());
//        return "#";
//    }
    @PostMapping("/login")
    public  LoginUserDto loginUser(@RequestBody LoginUserDto loginUserDto) {
        return userService.LoginUser(loginUserDto);
    }





}
