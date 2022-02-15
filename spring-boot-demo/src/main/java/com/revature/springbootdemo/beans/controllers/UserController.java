package com.revature.springbootdemo.beans.controllers;

import com.revature.springbootdemo.beans.Repositories.CarRepository;
import com.revature.springbootdemo.beans.Repositories.UserRepository;
import com.revature.springbootdemo.beans.models.Users;
import org.apache.catalina.User;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Acts as a servlet for HTTP requests
 */
@RestController // @ResponseBody and @Controller are implied by @RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    private final CarRepository carRepository;

    @Autowired // not necessary for now, as constructor has no dependencies.
    public UserController(UserRepository userRepository, CarRepository carRepository) {
        this.userRepository = userRepository;
        this.carRepository = carRepository;
    }

    // get all users
    @RequestMapping(method = RequestMethod.GET)
    public List<Users> getAllUsers(@RequestBody Users users){

        return userRepository.findAll();
    }

    // get a user by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public void getUserById(@PathVariable Integer id){
        userRepository.getById(id);
    }


    // post a user
    @RequestMapping(method = RequestMethod.POST)
    public void postUser(@RequestBody Users user){
        userRepository.save(user);
    }

    // delete a user
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Integer id, @RequestBody Users user){
        userRepository.deleteById(id);
    }
}
