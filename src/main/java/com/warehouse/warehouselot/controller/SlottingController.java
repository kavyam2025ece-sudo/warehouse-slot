package com.warehouse.warehouselot.controller;

import com.warehouse.warehouselot.entity.Bin;
import com.warehouse.warehouselot.service.SlottingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlottingController {

    private final SlottingService slottingService;

    public SlottingController(SlottingService slottingService) {
        this.slottingService = slottingService;
    }

    @GetMapping("/slotting")
    public Bin findBin(@RequestParam Integer quantity) {
        return slottingService.findSuitableBin(quantity);
    }
}