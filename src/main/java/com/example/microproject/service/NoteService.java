package com.example.microproject.service;

import com.example.microproject.model.*;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Service
public class NoteService {

/*public void addNote(Note note) throws JAXBException {
    Notes notes = new Notes();
    notes.addNotes(note);
    JAXBContext context = JAXBContext.newInstance(Notes.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
    marshaller.marshal(notes,new File("src/main/resources/data/notes.xml"));
}*/
    public Notes readNote(File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Notes.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Notes) unmarshaller.unmarshal(xmlFile);
    }

    public void addNote(Note note) throws JAXBException {
        File xmlFile = new File("src/main/resources/data/notes.xml");
        Notes notes = readNote(xmlFile);

        // Add the new student
        notes.getNotes().add(note);

        // Save the updated data back to the XML file
        saveNotes(notes, xmlFile);
    }
    public void saveNotes(Notes notes, File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Notes.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(notes, xmlFile);
    }
}
