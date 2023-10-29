package com.example.microproject;

import com.example.microproject.model.Semester;
import com.example.microproject.model.Semester1;
import com.example.microproject.model.Student;
import com.example.microproject.model.Students;
import com.example.microproject.service.Semseter1Sevice;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Student s = new Student();
        s.setName("abdooo");
        Semseter1Sevice semseter1Sevice = new Semseter1Sevice();
        Students students = new Students();
        students.addStudent(s);
    }
}
