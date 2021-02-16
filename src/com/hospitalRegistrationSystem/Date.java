package com.hospitalRegistrationSystem;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDateOfBirth() {
        return "" + day + "/" + month + "/" + year;
    }

    public void setDay(int day) {
        if(day > 31){
            throw new IllegalArgumentException("Invalid day");
        }
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        if(month > 12){
            throw new IllegalArgumentException("Invalid month");
        }
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        if(year < 1900){
            throw new IllegalArgumentException("Invalid year");
        }
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
