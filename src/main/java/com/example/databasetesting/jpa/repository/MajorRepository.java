package com.example.databasetesting.jpa.repository;

import com.example.databasetesting.jpa.entities.Major;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MajorRepository extends JpaRepository<Major, Integer> {
}
