package com.example.microproject.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class RelevieDesNotes {
    private List<RelevieDesNote> notesList;

    public List<RelevieDesNote> getNotesList() {
        return notesList;
    }

    @XmlElement(name = "note")
    public void setNotesList(List<RelevieDesNote> notesList) {
        this.notesList = notesList;
    }
}

