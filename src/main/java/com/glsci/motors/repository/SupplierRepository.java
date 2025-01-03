package com.glsci.motors.repository;

import com.glsci.motors.model.Supplier;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
	public Supplier findSupplierByName(String name);
	
//	@Query("Select s from Supplier as s where s.name like CONCAT('%',:k,'%') ")
//    public Supplier findSupplierByName(@Param("k") String keyword);
}
