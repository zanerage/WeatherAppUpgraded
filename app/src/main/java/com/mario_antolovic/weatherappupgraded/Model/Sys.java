package com.mario_antolovic.weatherappupgraded.Model;

public class Sys {
    //public int type;
    //public int id;
    private double message ;
    private String country ;
    private int sunrise ;
    private int sunset ;


    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSunrise() {
        return sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public int getSunset() {
        return sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

    public Sys(){

    }
}
