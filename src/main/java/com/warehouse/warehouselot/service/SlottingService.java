package com.warehouse.warehouselot.service;

import com.warehouse.warehouselot.entity.Bin;
import com.warehouse.warehouselot.repository.BinRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SlottingService {

    private final BinRepository binRepository;

    public SlottingService(BinRepository binRepository) {
        this.binRepository = binRepository;
    }

    public Bin findSuitableBin(Integer quantity) {

        List<Bin> bins = binRepository.findAll();

        for (Bin bin : bins) {
            if (bin.getCapacity() >= quantity) {
                return bin;
            }
        }

        return null;
    }
}
