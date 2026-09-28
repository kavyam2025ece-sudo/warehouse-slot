package com.warehouse.warehouselot.repository;

import com.warehouse.warehouselot.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
