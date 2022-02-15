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

    // GET car by ID
    public Cars getCars(Cars car){
        return carRepo.getById(car.getCarId());
    }

    // DELETE by ID
    public void deleteCars(Cars car){
        carRepo.delete(car);
    }
}
