package com.bt.lab3;

import androidx.annotation.NonNull;

public class bai3_Country {
    private String countryName;
    private  String flagName;
    private  int population;

    public bai3_Country(String countryName, String flagName, int population) {
        this.countryName = countryName;
        this.flagName = flagName;
        this.population = population;
    }

    @NonNull
    @Override
    public String toString() {
        return  this.countryName+" (Population: "+ this.population+")";
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
