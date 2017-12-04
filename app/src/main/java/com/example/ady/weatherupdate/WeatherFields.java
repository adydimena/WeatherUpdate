package com.example.ady.weatherupdate;

/**
 * Created by Ady on 12/3/2017.
 */

public class WeatherFields {
    String City;
    String States;
    String tempf;
    String tempC;
    String CurrentTemp;

    public WeatherFields(String city, String states, String tempf, String tempC, String currentTemp) {
        City = city;
        States = states;
        this.tempf = tempf;
        this.tempC = tempC;
        CurrentTemp = currentTemp;
    }

    public String getCurrentTemp() {
        return CurrentTemp;
    }

    public void setCurrentTemp(String currentTemp) {
        CurrentTemp = currentTemp;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStates() {
        return States;
    }

    public void setStates(String states) {
        States = states;
    }

    public String getTempf() {
        return tempf;
    }

    public void setTempf(String tempf) {
        this.tempf = tempf;
    }

    public String getTempC() {
        return tempC;
    }

    public void setTempC(String tempC) {
        this.tempC = tempC;
    }
}
