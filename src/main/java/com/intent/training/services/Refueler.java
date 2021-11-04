package com.intent.training.services;

import com.intent.training.entity.Aircraft;
import org.springframework.stereotype.Component;

@Component
public class Refueler {

    public void doRefuel(Aircraft aircraft, int fuelvVolume){
        System.out.println("The fuel volume was checked before refueling -> I start refueling " + aircraft.getClass());
        aircraft.loadFuel(fuelvVolume);
    }

    public void doRefuel(Aircraft aircraft,int fuelvVolume1, int fuelvVolume2){
        System.out.println("The fuel volume was checked before refueling -> I start refueling " + aircraft.getClass());
        aircraft.loadFuel(fuelvVolume1,fuelvVolume2);
    }

}
