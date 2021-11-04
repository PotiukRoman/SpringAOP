
package com.intent.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Aerostat implements Aircraft{
    boolean engine=false;
    String fuelType1="HELIUM";
    String fuelType2="WATER";
    int fuelLevel1=50;
    int fuelLevel2=50;

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
        return false;
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
