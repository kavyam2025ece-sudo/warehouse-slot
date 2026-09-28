package com.warehouse.warehouselot.repository;

import com.warehouse.warehouselot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

