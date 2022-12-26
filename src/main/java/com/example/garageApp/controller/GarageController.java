package com.example.garageApp.controller;

import com.example.garageApp.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GarageController {
    @RequestMapping("/car")
    public Car getCard(){
    Car myCar = new Car(1,"polo","volkswagen",2004, Car.Color.grey);
        return myCar;
    }
}
