/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlykhoahoc.Entity;

/**
 *
 * @author Manh Hai
 */
public class OnsiteCourse extends Course {
    private String location;
    private String days;
    private String time;

    public OnsiteCourse() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString()+  " OnsiteCourse{" + "location=" + location + ", days=" + days + ", time=" + time + '}';
    }

    
}
