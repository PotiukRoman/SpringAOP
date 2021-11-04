package com.intent.training.services;

import com.intent.training.entity.Aircraft;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
    public boolean doChecksMotorlessDevices(Aircraft aircraft){

        if(!aircraft.isEngine()){
            aircraft.getStatus();
            System.out.println("Instructor say: "+ aircraft.getClass()+ " has no engine, the check of the motorless device is completed");
            aircraft.setReadyStatus(true);
            return true;
        }else {
            System.out.println("Instructor say: " + aircraft.getClass()+ " has an engine, this is not my area of responsibility");
            System.out.println();
            return false;
        }

    }

}
