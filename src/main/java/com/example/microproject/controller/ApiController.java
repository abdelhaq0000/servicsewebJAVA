package com.example.microproject.controller;

import ch.qos.logback.core.model.Model;
import com.example.microproject.model.Student;
import com.example.microproject.model.Students;
import com.example.microproject.service.XmlDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBException;

@RestController
public class ApiController {

    @Autowired
    private XmlDataService xmlDataService;

    @GetMapping("/students")
    public Students getStudents() throws JAXBException {
        return xmlDataService.readXmlData();
    }

    @GetMapping("/hi")
    public String hi() {
        return "hi abdelhaq";
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) throws JAXBException {
        xmlDataService.addStudent(student);
        return "Student added successfully.";
    }
}