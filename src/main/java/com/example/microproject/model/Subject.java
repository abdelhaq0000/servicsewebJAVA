package com.example.microproject.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "module")
public class Subject {
   @XmlAttribute
    private Integer id_m;
   @XmlAttribute
    private String Nom;
   @XmlAttribute
    private Integer SemesterID;

    @Override
    public String toString() {
        return "Subject{" +
                "id_m=" + id_m +
                ", Nom='" + Nom + '\'' +
                ", SemesterID=" + SemesterID +
                '}';
    }
}
