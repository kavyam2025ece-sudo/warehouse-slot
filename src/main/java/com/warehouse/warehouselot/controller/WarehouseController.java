package com.warehouse.warehouselot.controller;

import com.warehouse.warehouselot.entity.Warehouse;
import com.warehouse.warehouselot.repository.WarehouseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WarehouseController {

    private final WarehouseRepository warehouseRepository;

    public WarehouseController(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    @GetMapping("/warehouses")
    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }
}