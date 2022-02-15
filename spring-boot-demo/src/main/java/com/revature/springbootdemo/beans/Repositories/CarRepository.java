package com.revature.springbootdemo.beans.Repositories;

import com.revature.springbootdemo.beans.models.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Handles data persistence
 */
@Repository
public interface CarRepository extends JpaRepository<Cars, Integer>  {
}
