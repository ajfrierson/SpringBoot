package com.revature.springbootdemo.beans.controllers;

import com.revature.springbootdemo.beans.models.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // @ResponseBody and @Controller are implied by @RestController
@RequestMapping("/cars")
public class CarController {

   // @Autowired // not necessary for now, as constructor has no dependencies.
    public CarController(){

    }

    // get all cars
    @RequestMapping(method = RequestMethod.GET)
    public List<Cars> getAllCars(){
        return null;
    }

    // get a single car by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cars getCarById(@PathVariable Integer id){
        return null;
    }

    // post a car
    @RequestMapping(method = RequestMethod.POST)
    public void postCar(@RequestBody Cars car){

    }

    //update a car by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateCarById(@RequestBody Cars car, @PathVariable Integer id){

    }

    //delete a car by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable Integer id){

    }
}
