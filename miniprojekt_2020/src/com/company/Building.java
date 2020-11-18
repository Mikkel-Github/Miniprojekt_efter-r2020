package com.company;

import java.util.ArrayList;

public class Building {

    ArrayList<String> building = new ArrayList<>();;

    public void addBuilding(String building) {
        this.building.add(building);
    }

    public void removeBuilding(String building) {
        this.building.remove(building);
    }

    public ArrayList<String> getBuilding() {
        return building;
    }
}
