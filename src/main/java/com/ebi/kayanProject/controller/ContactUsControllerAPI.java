package com.ebi.kayanProject.controller;

import com.ebi.kayanProject.model.ContactUsDto;
import com.ebi.kayanProject.service.ContactUsServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contactUsApi")
public class ContactUsControllerAPI {

    private final ContactUsServiceInt contactUsService;

    @Autowired
    public ContactUsControllerAPI(ContactUsServiceInt contactUsService) {

        this.contactUsService = contactUsService;
    }


    @PostMapping
    public void SendMessage(@RequestBody ContactUsDto contactUsDto) {
     contactUsService.SendMessage(contactUsDto);


    }







}
