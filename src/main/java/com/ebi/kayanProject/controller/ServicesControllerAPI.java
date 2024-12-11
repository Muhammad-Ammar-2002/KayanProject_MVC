package com.ebi.kayanProject.controller;


import com.ebi.kayanProject.model.ServicesDto;
import com.ebi.kayanProject.service.ServicesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testService")
public class ServicesControllerAPI {
    private final ServicesService servicesService;

public ServicesControllerAPI(ServicesService servicesService) {
    this.servicesService = servicesService;
}


@GetMapping("/getService")
    public ServicesDto getService(@RequestParam Long id) {
    ServicesDto servicesDto = servicesService.getServiceById(id);
    return servicesDto;
}

}
