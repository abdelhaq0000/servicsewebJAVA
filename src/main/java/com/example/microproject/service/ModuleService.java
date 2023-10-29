package com.example.microproject.service;

import com.example.microproject.model.Modules;
import com.example.microproject.model.Subject;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

@Service
public class ModuleService {
    public void addModule(Subject module) throws JAXBException {
        Modules modules = new Modules();
        modules.addModule(module);
        JAXBContext context = JAXBContext.newInstance(Modules.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(modules,new File("src/main/resources/data/modules.xml"));
    }

}
