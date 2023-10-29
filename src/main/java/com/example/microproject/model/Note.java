package com.example.microproject.model;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Note {
    @XmlAttribute
    private Integer studentID;
    @XmlAttribute
    private Integer moduleID;
    @XmlElement
    private double noteValue;

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public Integer getModuleID() {
        return moduleID;
    }

    public void setModuleID(Integer moduleID) {
        this.moduleID = moduleID;
    }

    public double getNoteValue() {
        return noteValue;
    }

    public void setNoteValue(double noteValue) {
        this.noteValue = noteValue;
    }
}
