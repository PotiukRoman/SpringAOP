
package com.intent.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Dirigible implements Aircraft{
    boolean engine=true;
    String fuelType1="GAS";
    String fuelType2="HELIUM";
    int fuelLevel1=100;
    int fuelLevel2=100;

    boolean readyStatus=false;

    @Override
    public String getStatus() {
        if(readyStatus){
            return this + "  ready to fly";
        }
        return this + " is not ready ->  do  prepareToTakeOff()";
    }

    public void prepareToTakeOff() {
        System.out.println("prepareToTakeOff() - > Depending on the type of aircraft, consult a mechanic, refueler or instructor");
        System.out.println();
    }

    public void loadFuel(int fuelLevel1,int fuelLevel2) {
        this.fuelLevel1=fuelLevel1;
        this.fuelLevel2=fuelLevel2;
        this.readyStatus=true;
    }

    @Override
    public void setReadyStatus(boolean readyStatus) {

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

    public String getFuelType1() {
        return fuelType1;
    }

    public String getFuelType2() {
        return fuelType2;
    }

    public int getFuelLevel1() {
        return fuelLevel1;
    }

    public int getFuelLevel2() {
        return fuelLevel2;
    }

    @Override
    public void loadFuel(int fuelLevel) {

    }
}
