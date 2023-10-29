package com.example.microproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.*;
@Data
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
   @XmlAttribute
    private String name;
    @XmlAttribute
    private int apogee;
    @XmlAttribute
    private String prenom;
    @XmlElement
    private double noteN;
    @XmlElement
    private double noteR;
    @XmlAttribute
    private String email;

    private static int lastApogee = 0;
    public Student() {
        lastApogee++;
        this.apogee = lastApogee;
    }


}
