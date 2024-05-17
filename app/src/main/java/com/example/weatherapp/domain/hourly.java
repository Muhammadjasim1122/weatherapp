package com.example.weatherapp.domain;

public class hourly {
    private String hour;
    private String temp;

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }

    public hourly(String hour, String temp, String picpath) {
        this.hour = hour;
        this.temp = temp;
        this.picpath = picpath;
    }

    private  String picpath;


}
