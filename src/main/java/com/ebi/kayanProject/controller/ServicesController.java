package com.ebi.kayanProject.controller;


import com.ebi.kayanProject.model.ServicesDto;
import com.ebi.kayanProject.service.ServicesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/service")
public class ServicesController {
    private final ServicesService servicesService;

public ServicesController(ServicesService servicesService) {

    this.servicesService = servicesService;
}


    @GetMapping("/serviceDetails")
    public String getServices() {
        return "allservice";
    }

//    @PostMapping
//    public String getServices(@ModelAttribute Long id) {
//    servicesService.getServiceById(id);
//        return "redirect:/service";
//    }
    @GetMapping("/AllServices")
    public String allServices(Model model) {
    List<ServicesDto> services = servicesService.getAllServices();
    model.addAttribute("services", services);
    return "allservice";
    }



}
