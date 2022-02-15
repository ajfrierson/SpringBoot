package com.revature.springbootdemo.beans.services;

import com.revature.springbootdemo.beans.Repositories.UserRepository;
import com.revature.springbootdemo.beans.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepo;

    @Autowired
    public void UserService(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    // Save
    public void save(Users user){
        userRepo.save(user);
    }

    // Get
    public Users getUser(Users user){
        return userRepo.getById(user.getId());
    }

}
