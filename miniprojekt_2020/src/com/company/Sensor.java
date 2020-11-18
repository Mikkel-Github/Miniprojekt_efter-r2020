package com.company;

import java.util.ArrayList;

public class Sensor {
    ArrayList<String> sensor = new ArrayList<>();

    public void addSensor(String sensor) {
        this.sensor.add(sensor);
    }

    public void removeSensor(String sensor) {
        this.sensor.remove(sensor);
    }

    public void updateSensor(int sensorToChange, String newSensor) {
        this.sensor.remove(sensorToChange);
        this.sensor.add(sensorToChange, newSensor);
    }

    public ArrayList<String> getSensor() {
        return sensor;
    }
}
