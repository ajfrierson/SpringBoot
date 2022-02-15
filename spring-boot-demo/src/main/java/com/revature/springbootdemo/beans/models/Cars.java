package com.revature.springbootdemo.beans.models;

import javax.persistence.*;

@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_Id")
    private Integer car_Id;

    @Column
    private String make;

    @Column
    private String model;

    @Column
    private String color;

    @Column
    private Integer year;

    public Cars() {
    }

    public Cars(Integer car_Id, String make, String model, String color, int year) {
        this.car_Id = car_Id;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public int getCarId() {
        return car_Id;
    }

    public void setCarId(int carId) {
        this.car_Id = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
