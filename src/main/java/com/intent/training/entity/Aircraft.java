package com.intent.training.entity;

import java.util.concurrent.atomic.AtomicBoolean;

public interface Aircraft {
    String getStatus();
    boolean isEngine();
    int getFuelLevel();
    String getFuelType();
    String getFuelType1();
    String getFuelType2();
    int getFuelLevel1();
    int getFuelLevel2();
    void loadFuel(int fuelLevel);
    void loadFuel(int fuelLevel1,int fuelLevel2);
    void setReadyStatus(boolean readyStatus);
}
