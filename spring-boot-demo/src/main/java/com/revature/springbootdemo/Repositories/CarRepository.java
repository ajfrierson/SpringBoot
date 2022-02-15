package com.revature.springbootdemo.Repositories;

import com.revature.springbootdemo.beans.models.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Cars, Integer>  {
}
