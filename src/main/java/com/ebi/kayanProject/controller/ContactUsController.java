package com.ebi.kayanProject.controller;

import com.ebi.kayanProject.model.ContactUsDto;
import com.ebi.kayanProject.model.LoginUserDto;
import com.ebi.kayanProject.model.UserDto;
import com.ebi.kayanProject.service.ContactUsServiceInt;
import com.ebi.kayanProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contactUs")
public class ContactUsController {

    private final ContactUsServiceInt contactUsService;

    public ContactUsController(ContactUsServiceInt contactUsService) {

        this.contactUsService = contactUsService;
    }


    @GetMapping
    public String SendMessage(Model model) {
        model.addAttribute("contactUsDto", new ContactUsDto());
        return  "contact";
    }

    @PostMapping
    public String SendMessage(@ModelAttribute ContactUsDto contactUsDto) {
        contactUsService.SendMessage(contactUsDto);
        return "redirect:/contactUs";
    }

}
