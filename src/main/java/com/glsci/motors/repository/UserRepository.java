package com.glsci.motors.repository;

import com.glsci.motors.model.Role;
import com.glsci.motors.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {
    public User findUserById(int id);
    public User findByUsername(String username);
    public List<User> findUsersByRole(Role role);
}
