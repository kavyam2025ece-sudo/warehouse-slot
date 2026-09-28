package com.warehouse.warehouselot.service;

import com.warehouse.warehouselot.entity.Product;
import com.warehouse.warehouselot.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PickListService {

    private final ProductRepository productRepository;

    public PickListService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> generatePickList() {
        return productRepository.findAll();
    }
}