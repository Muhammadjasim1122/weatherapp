package com.example.weatherapp.domain;

public class FutureDomain {

    private String day;
    private String Picapth;
    private String status;
    private String hightemp;
    private String lowtemp;

    public FutureDomain(String day, String picapth, String status, String hightemp, String lowtemp) {
        this.day = day;
        Picapth = picapth;
        this.status = status;
        this.hightemp = hightemp;
        this.lowtemp = lowtemp;
    }

    public String getHightemp() {
        return hightemp;
    }

    public void setHightemp(String hightemp) {
        this.hightemp = hightemp;
    }

    public String getLowtemp() {
        return lowtemp;
    }

    public void setLowtemp(String lowtemp) {
        this.lowtemp = lowtemp;
    }



    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPicapth() {
        return Picapth;
    }

    public void setPicapth(String picapth) {
        Picapth = picapth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
