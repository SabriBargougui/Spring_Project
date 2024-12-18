package com.glsci.motors.service;

import com.glsci.motors.interfacemethods.InventoryInterface;
import com.glsci.motors.model.Inventory;
import com.glsci.motors.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class InventoryImplementation implements InventoryInterface {
    @Autowired
    InventoryRepository irepo;

    @Override
    @Transactional
    public boolean saveInventory(Inventory inventory) {
        if (irepo.save(inventory) != null)
            return true;
        else
            return false;
    }

    @Override
    @Transactional
    public List<Inventory> findAllInventorys() {
        return irepo.findAll();
    }

    @Override
    @Transactional
    public Inventory findInventoryById(Integer id) {
        return irepo.findById(id).get();
    }

    @Override
    @Transactional
    public void deleteInventory(Inventory inventory) {
        irepo.delete(inventory);
    }

}
