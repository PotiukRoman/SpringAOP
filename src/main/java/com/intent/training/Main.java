package com.intent.training;

import com.intent.training.entity.*;
import com.intent.training.services.Auditor;

import com.intent.training.services.Instructor;
import com.intent.training.services.Mechanic;
import com.intent.training.services.Refueler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("Hi!");
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intent.training");

        Plane plane=(Plane) context.getBean("plane");
        Helicopter helicopter = (Helicopter)context.getBean("helicopter");
        Glider glider=(Glider)context.getBean("glider");
        Motorglider motorglider=(Motorglider)context.getBean("motorglider");
        Paraglider paraglider1=(Paraglider)context.getBean("paraglider");
        Paraglider paraglider2=(Paraglider)context.getBean("paraglider");
        Dirigible dirigible=(Dirigible)context.getBean("dirigible");
        Aerostat aerostat=(Aerostat) context.getBean("aerostat");

        Auditor auditor=(Auditor)context.getBean("auditor");
        Mechanic mechanic=(Mechanic)context.getBean("mechanic");
        Instructor instructor=(Instructor)context.getBean("instructor");
        Refueler refueler=(Refueler)context.getBean("refueler");


        auditor.doAudit(dirigible);
        dirigible.prepareToTakeOff();
        mechanic.doEngineInspection(dirigible);
        instructor.doChecksMotorlessDevices(dirigible);
        refueler.doRefuel(dirigible,500,400);
        auditor.doAudit(dirigible);

        auditor.doAudit(plane);
        plane.prepareToTakeOff();
        mechanic.doEngineInspection(plane);
        instructor.doChecksMotorlessDevices(plane);
        refueler.doRefuel(plane,500);
        auditor.doAudit(plane);

        auditor.doAudit(paraglider1);
        paraglider1.prepareToTakeOff();
        mechanic.doEngineInspection(paraglider1);
        instructor.doChecksMotorlessDevices(paraglider1);
        auditor.doAudit(paraglider1);


        System.out.println("Bye.");
    }

}
