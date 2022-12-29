package com.example.garageApp.service;

import com.example.garageApp.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {
    static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
            new Car(1, "polo", "Volkswagen", 2004, Car.Color.grey),
            new Car(2, "207", "Peugeot", 2016, Car.Color.red),
            new Car(3, "C1", "Citroën", 2007, Car.Color.black),
            new Car(4, "clio", "Renault", 2014, Car.Color.blue),
            new Car(5, "megane", "Renault", 2004, Car.Color.white),
            new Car(6, "duster", "Dacia", 2004, Car.Color.yellow),
            new Car(7, "sandero", "Dacia", 2004, Car.Color.grey)
    ));
    public List<Car> getCars(){
        return cars;
    }
}
