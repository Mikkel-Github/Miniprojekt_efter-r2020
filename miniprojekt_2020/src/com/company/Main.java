package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sensor sensor = new Sensor();
        sensor.addSensor("test");
        sensor.addSensor("test1");
        sensor.addSensor("test2");

        Aktuator aktuator = new Aktuator();

        aktuator.addAktuator("aku1");
        aktuator.addAktuator("aku2");
        aktuator.addAktuator("aku3");

        sensor.updateSensor(1, "tis");
        aktuator.updateAktuator(1, "pis");
        for (String s:sensor.getSensor()) {
            System.out.println(s);
        }
        for (String a:aktuator.getAktuator()) {
            System.out.println(a);
        }
    }
}
