package com.intent.training.services;

import com.intent.training.entity.Aircraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Auditor {
    public String doAudit(Aircraft aircraft){
        System.out.println("Auditor say: ");
        return aircraft.getStatus();
    }
}
