package com.warehouse.warehouselot.controller;

import com.warehouse.warehouselot.entity.Bin;
import com.warehouse.warehouselot.repository.BinRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BinController {

    private final BinRepository binRepository;

    public BinController(BinRepository binRepository) {
        this.binRepository = binRepository;
    }

    @GetMapping("/bins")
    public List<Bin> getAllBins() {
        return binRepository.findAll();
    }
}
