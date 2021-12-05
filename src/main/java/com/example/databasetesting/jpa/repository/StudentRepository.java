package com.example.databasetesting.jpa.repository;

import com.example.databasetesting.jpa.dto.StuProResponse;
import com.example.databasetesting.jpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer > {

    // NOTE THIS SQL SYNTAX IS UNIQUE TO JPA, LOOKUP DOCS
    // A DTO StuProResponse used as there are many not just one?
    @Query("SELECT new com.example.databasetesting.jpa.dto.StuProResponse(stu.firstName, pro.productName) FROM Student stu JOIN stu.products pro")
    public List<StuProResponse> getJoinInformation();

    /*
    What query line does is
    Create a new StuProResponse obj, with constr args stu.firstName, pro.ProductName
    Where these constr args are taken from
    Student table we that we call stu
    Join it with stu.products where we call it pro
     */

}
