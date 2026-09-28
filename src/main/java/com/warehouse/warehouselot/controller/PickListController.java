package com.warehouse.warehouselot.controller;

import com.warehouse.warehouselot.entity.Product;
import com.warehouse.warehouselot.service.PickListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PickListController {

    private final PickListService pickListService;

    public PickListController(PickListService pickListService) {
        this.pickListService = pickListService;
    }

    @GetMapping("/pick-list")
    public List<Product> getPickList() {
        return pickListService.generatePickList();
    }
}
