package com.revature.springbootdemo.Repositories;

import com.revature.springbootdemo.beans.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>  {
}
