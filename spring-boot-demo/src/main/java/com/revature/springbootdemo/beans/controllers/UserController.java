package com.revature.springbootdemo.beans.controllers;

import com.revature.springbootdemo.beans.models.Users;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // @ResponseBody and @Controller are implied by @RestController
@RequestMapping("/users")
public class UserController {

    // @Autowired // not necessary for now, as constructor has no dependencies.
    public UserController() {
    }

    // get all users
    @RequestMapping(method = RequestMethod.GET)
    public List<Users> getAllUsers(){
        return null;
    }

    // get a user by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public void getUserById(@PathVariable Integer id){

    }


    // post a user
    @RequestMapping(method = RequestMethod.POST)
    public void postUser(@RequestBody Users user){

    }

    // delete a user
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Integer id, @RequestBody Users user){

    }
}
