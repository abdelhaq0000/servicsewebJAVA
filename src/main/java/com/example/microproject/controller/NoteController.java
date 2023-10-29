package com.example.microproject.controller;

import com.example.microproject.model.Note;
import com.example.microproject.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

@RestController
public class NoteController {
    @Autowired
    NoteService noteService;
    @PostMapping("/addNote")
    public String addNote(@RequestBody Note note) throws JAXBException {
        noteService.addNote(note);
        return "note added";
    }
}
