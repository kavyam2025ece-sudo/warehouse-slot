package com.warehouse.warehouselot.repository;

import com.warehouse.warehouselot.entity.Bin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BinRepository extends JpaRepository<Bin, Long> {
}

