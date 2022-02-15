package com.revature.springbootdemo.beans.services;

import com.revature.springbootdemo.beans.Repositories.CarRepository;
import com.revature.springbootdemo.beans.models.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final CarRepository carRepo;

    @Autowired
    public CarService(CarRepository carRepo){
        this.carRepo = carRepo;
    }


    // save
    public void save(Cars car){
        carRepo.save(car);
    }

    // Get
    public Cars getCars(Cars car){
        return carRepo.getById(car.getCarId());
    }
}
