package com.example.databasetesting.jpa.repository;

import com.example.databasetesting.jpa.entities.Clubs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepository extends JpaRepository<Clubs, String> {
    
}
