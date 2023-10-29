package com.example.microproject.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.Data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Semester {
    @XmlAttribute
    private Integer semesterID;
    @XmlElement(name = "module")
    public List<Integer> modulesID=new ArrayList<>();
    @XmlElement(name = "student")
    public List<Integer> studentsID=new ArrayList<>();

}

