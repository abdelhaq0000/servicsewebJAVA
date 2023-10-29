package com.example.microproject.controller;

import com.example.microproject.model.Subject;
import com.example.microproject.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

@RestController
public class ModuleController {
    @Autowired
    ModuleService moduleService;
    @PostMapping("/addModule")
    public String addModulle(@RequestBody Subject subject) throws JAXBException {
        System.out.println("\n\n\n\n\n\n\n\n"+subject.toString()+"\n\n\n\n\n\n\n\n");
        moduleService.addModule(subject);
        return "Module added";
    }

}
