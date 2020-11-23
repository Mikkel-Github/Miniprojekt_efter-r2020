package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Sensor
        Sensor sensor = new Sensor();
        sensor.addSensor("test");
        sensor.addSensor("test1");
        sensor.addSensor("test2");

        // Aktuator
        Aktuator aktuator = new Aktuator();
        aktuator.addAktuator("aku1");
        aktuator.addAktuator("aku2");
        aktuator.addAktuator("aku3");

        // Opdatering af Sensor
        sensor.updateSensor(1, "tis");
        // Opdatering af Aktuator
        aktuator.updateAktuator(1, "pis");

        // Print sensorer
        for (String s:sensor.getSensor()) {
            System.out.println(s);
        }
        // Print aktuator
        for (String a:aktuator.getAktuator()) {
            System.out.println(a);
        }
    }
}
