package com.example.microproject.service;

import com.example.microproject.model.Modules;
import com.example.microproject.model.RelevieDesNotes;
import com.example.microproject.model.Student;
import com.example.microproject.model.Students;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Service
public class XmlDataService{

    public Students readXmlData() throws JAXBException {
        File xmlFile = new File("src/main/resources/data/students.xml"); // Adjust the path as needed
        JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Students) unmarshaller.unmarshal(xmlFile);
    }
    private static final String XML_FILE_PATH = "src/main/resources/data/students.xml";

    public void addStudent(Student student) throws JAXBException {
        File xmlFile = new File(XML_FILE_PATH);
        Students students = readStudents(xmlFile);

        // Add the new student
        students.getStudentList().add(student);

        // Save the updated data back to the XML file
        saveStudents(students, xmlFile);
    }


    public Students readStudents(File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Students) unmarshaller.unmarshal(xmlFile);
    }

    public void saveStudents(Students students, File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(students, xmlFile);
    }
    public Modules readModulesXmlData(File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Modules.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Modules) unmarshaller.unmarshal(xmlFile);
    }
    public void saveModules(Modules modules , File xmlfile) throws JAXBException{
        JAXBContext jaxbContext = JAXBContext.newInstance(Modules.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(modules,xmlfile);
    }
    public RelevieDesNotes readRelevieDesNotesXmlData() throws JAXBException {
        File xmlFile = new File("src/main/resources/data/RelevieDesNotes.xml"); // Adjust the path as needed
        JAXBContext jaxbContext = JAXBContext.newInstance(RelevieDesNotes.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (RelevieDesNotes) unmarshaller.unmarshal(xmlFile);
    }
}