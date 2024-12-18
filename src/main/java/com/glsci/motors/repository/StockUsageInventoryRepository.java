package com.glsci.motors.repository;

import com.glsci.motors.model.StockUsageInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface StockUsageInventoryRepository extends JpaRepository<StockUsageInventory, Integer> {
    public List<StockUsageInventory> findByRegistrationDateBetween(LocalDate startDate, LocalDate endDate);

}
