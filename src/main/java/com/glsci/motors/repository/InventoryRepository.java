package com.glsci.motors.repository;

import com.glsci.motors.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
    public Inventory findInventoryById(int id);
}
