package com.example.microproject.service;

import com.example.microproject.model.Modules;
import com.example.microproject.model.RelevieDesNotes;
import com.example.microproject.model.Student;
import com.example.microproject.model.Semester1;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Service
public class Semseter1Sevice{

    public Semester1 readXmlData() throws JAXBException {
        File xmlFile = new File("src/main/resources/data/Semester1.xml"); // Adjust the path as needed
        JAXBContext jaxbContext = JAXBContext.newInstance(Semester1.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Semester1) unmarshaller.unmarshal(xmlFile);
    }
    private static final String XML_FILE_PATH = "src/main/resources/data/Semester1.xml";

    public void inscritSemesterONE(Student student) throws JAXBException {
        File xmlFile = new File(XML_FILE_PATH);
        Semester1 semester1 = readSemester1(xmlFile);

        // Add the new student
        semester1.getStudentList().add(student);

        // Save the updated data back to the XML file
        saveSemester1(semester1, xmlFile);
    }


    public Semester1 readSemester1(File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Semester1.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Semester1) unmarshaller.unmarshal(new File("src/main/resources/data/Semester1.xml"));
    }

    public void saveSemester1(Semester1 semester1, File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Semester1.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(semester1, xmlFile);
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