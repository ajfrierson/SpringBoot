package com.revature.springbootdemo.beans.Repositories;

import com.revature.springbootdemo.beans.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Handles data persistence
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Integer>  {
}
