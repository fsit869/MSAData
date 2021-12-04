package com.example.databasetesting.jpa.repository;

import com.example.databasetesting.jpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer > {
}
