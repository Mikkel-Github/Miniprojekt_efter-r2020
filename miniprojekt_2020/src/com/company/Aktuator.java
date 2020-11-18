package com.company;

import java.util.ArrayList;

public class Aktuator {
    ArrayList<String> aktuator = new ArrayList<>();

    public void addAktuator(String aktuator) {
        this.aktuator.add(aktuator);
    }

    public void removeAktuator(String aktuator) {
        this.aktuator.remove(aktuator);
    }

    public ArrayList<String> getAktuator() {
        return aktuator;
    }
}
