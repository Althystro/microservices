package com.example.microservices_demo.repository;

import com.example.microservices_demo.entity.StockEntity;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<StockEntity, Long> {

    Iterable<StockEntity> findByItem(String item);
}