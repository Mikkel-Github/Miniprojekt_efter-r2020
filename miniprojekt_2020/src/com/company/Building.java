package com.company;

import java.util.ArrayList;

public class Building {
    ArrayList<Sensor> sensors = new ArrayList<>();
    ArrayList<Aktuator> aktuators = new ArrayList<>();

    // Sensor
    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public void removeSensor(Sensor sensor) {
        this.sensors.remove(sensor);
    }

    public ArrayList<Sensor> getSensor() {
        return sensors;
    }

    // Aktuator
    public void addAktuator(Aktuator aktuator) {
        this.aktuators.add(aktuator);
    }

    public void removeAktuator(Aktuator aktuator) {
        this.aktuators.remove(aktuator);
    }

    public ArrayList<Aktuator> getAktuator() {
        return aktuators;
    }
}
