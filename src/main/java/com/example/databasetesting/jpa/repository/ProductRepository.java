package com.example.databasetesting.jpa.repository;

import com.example.databasetesting.jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
