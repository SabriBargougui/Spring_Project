package com.glsci.motors.interfacemethods;

import com.glsci.motors.model.StockUsageInventory;

import java.util.List;

public interface StockUsageInventoryInterface {
    public void saveStockUsageInventory(StockUsageInventory sui);
    public void deleteStockUsageInventory(StockUsageInventory sui);
    public List<StockUsageInventory> listAllStockUsageInventories();
    public StockUsageInventory findStockUsageInventoryById(Integer id);
}
