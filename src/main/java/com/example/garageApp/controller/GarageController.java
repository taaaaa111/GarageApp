package com.example.garageApp.controller;

import com.example.garageApp.model.Car;
import com.example.garageApp.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class GarageController {
    //@RequestMapping("/car")
    //public Car getCard(){
    //Car myCar = new Car(1,"polo","volkswagen",2004, Car.Color.grey);
    //    return myCar;
    //}

    @Autowired
    private GarageService GarageService;

    @RequestMapping("/cars")
    public List<Car> getCars(){
        return GarageService.getCars();
    }


}
