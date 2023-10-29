package com.example.microproject.service;

import com.example.microproject.model.Semester;
import com.example.microproject.model.Semesters;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Service
public class SemesterService {

    public Semesters readsemester(File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Semesters.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Semesters) unmarshaller.unmarshal(xmlFile);
    }

    public void addsemester(Semester semester) throws JAXBException {
        File xmlFile = new File("src/main/resources/data/Semesters.xml");
        Semesters semesters = readsemester(xmlFile);

        // Add the new student
        semesters.getSemesters().add(semester);

        // Save the updated data back to the XML file
        saveSemesters(semesters, xmlFile);
    }
    public void saveSemesters(Semesters semesters, File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Semesters.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(semesters, xmlFile);
    }
}
