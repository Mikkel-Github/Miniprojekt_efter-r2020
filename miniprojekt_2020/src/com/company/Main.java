package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sensor sensor = new Sensor();
        sensor.addSensor("test");
        sensor.addSensor("test1");
        sensor.addSensor("test2");

        sensor.updateSensor(1, "tis");
        for (String s:sensor.getSensor()) {
            System.out.println(s);
        }
    }
}
