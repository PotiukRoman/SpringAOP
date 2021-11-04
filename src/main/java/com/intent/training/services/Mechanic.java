package com.intent.training.services;
import lombok.Getter;
import com.intent.training.entity.Aircraft;
import org.springframework.stereotype.Component;

@Component
public class Mechanic {
    public boolean doEngineInspection(Aircraft aircraft){
        if(aircraft.isEngine()){
            System.out.println("Mechanic say: "+ aircraft.getClass()+ " the engine was inspected");
            return true;
        }else {
            System.out.println("Mechanic say: "+ aircraft.getClass()+ " has no engine, this is not my area of responsibility");
            System.out.println();
            return false;
        }

    }
}
