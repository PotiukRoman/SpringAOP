package com.intent.training.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicBoolean;

@Service
@Scope("prototype")
public class Paraglider implements Aircraft{
    boolean engine=false;
    boolean readyStatus = false;

    @Override
    public String getStatus() {

        if(readyStatus){
            return this + " ready to fly";
        }
            return this + " is not ready ->  do  prepareToTakeOff()";
    }

    public void prepareToTakeOff() {
        System.out.println("prepareToTakeOff() - > Depending on the type of aircraft, consult a mechanic, refueler or instructor");
        System.out.println();
    }

    @Override
    public boolean isEngine() {
        return engine;
    }

    @Override
    public int getFuelLevel() {
        return 0;
    }

    @Override
    public String getFuelType() {
        return null;
    }

    @Override
    public String getFuelType1() {
        return null;
    }

    @Override
    public String getFuelType2() {
        return null;
    }

    @Override
    public int getFuelLevel1() {
        return 0;
    }

    @Override
    public int getFuelLevel2() {
        return 0;
    }

    @Override
    public void loadFuel(int fuelLevel) {

    }

    @Override
    public void loadFuel(int fuelLevel1, int fuelLevel2) {

    }

    @Override
    public void setReadyStatus(boolean readyStatus) {
        this.readyStatus=readyStatus;
    }

}
