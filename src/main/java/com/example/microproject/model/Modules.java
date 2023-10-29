package com.example.microproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Modules {
    @XmlElement(name = "module")
    private List<Subject> moduleList=new ArrayList<>();

    public List<Subject> getModuleList() {
        return moduleList;
    }

    public void addModule(Subject module){
        moduleList.add(module);
    }

}




