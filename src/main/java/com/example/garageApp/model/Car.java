package com.example.garageApp.model;

public class Car {

    enum Color{
        red,
        blue,
        yellow,
        white,
        black,
        grey

    }

    private long id;
    private String model;
    private String brand;
    private int year;
    private Color color;

    public long getId() {
        return id;
    }

    public Car(long id, String model, String brand, int year, Color color) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        year = year;
        this.color = color;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
