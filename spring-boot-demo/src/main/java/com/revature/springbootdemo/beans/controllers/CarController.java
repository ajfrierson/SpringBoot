package com.revature.springbootdemo.beans.controllers;

import com.revature.springbootdemo.beans.Repositories.CarRepository;
import com.revature.springbootdemo.beans.Repositories.UserRepository;
import com.revature.springbootdemo.beans.models.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Acts as a servlet for HTTP requests
 */
@RestController // @ResponseBody and @Controller are implied by @RestController
@RequestMapping("/cars")
public class CarController {
 private final CarRepository carRepository;
 private final UserRepository userRepository;

   @Autowired // not necessary for now, as constructor has no dependencies.
    public CarController(CarRepository carRepository, UserRepository userRepository){
         this.carRepository = carRepository;
         this.userRepository = userRepository;
    }

    // get all cars
    @RequestMapping(method = RequestMethod.GET)
    public List<Cars> getAllCars(){
        return carRepository.findAll();
    }

    // get a single car by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cars getCarById(@PathVariable Integer id){
        return carRepository.getById(id);
    }

    // post a car
    @RequestMapping(method = RequestMethod.POST)
    public void postCar(@RequestBody Cars car){
          carRepository.save(car);
    }

    //update a car by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateCarById(@RequestBody Cars car, @PathVariable Integer id){
         carRepository.save(car);
    }

    //delete a car by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable Integer id){
         carRepository.deleteAll();
    }
}
