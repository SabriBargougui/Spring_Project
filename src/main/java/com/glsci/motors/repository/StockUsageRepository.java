package com.glsci.motors.repository;

import com.glsci.motors.model.StockUsage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockUsageRepository extends JpaRepository<StockUsage, Integer> {
    public StockUsage findByCustomerName(String name);
    public StockUsage findByCarId(int CarId);
}
