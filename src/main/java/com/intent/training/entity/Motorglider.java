
package com.intent.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Motorglider implements Aircraft{
    boolean engine=true;
    String fuelType="GAS";
    int fuelLevel=5;
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

    @Override
    public boolean isEngine() {
        return engine;
    }

    public void loadFuel(int fuelLevel) {
        this.fuelLevel=fuelLevel;
        this.readyStatus=true;
    }

    @Override
    public void loadFuel(int fuelLevel1, int fuelLevel2) {

    }

    @Override
    public void setReadyStatus(boolean readyStatus) {

    }

    public String getFuelType() {
        return fuelType;
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

    public int getFuelLevel() {
        return fuelLevel;
    }
}
