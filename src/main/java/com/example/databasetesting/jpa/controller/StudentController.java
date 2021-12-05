package com.example.databasetesting.jpa.controller;

import com.example.databasetesting.jpa.dto.StudentRequest;
import com.example.databasetesting.jpa.entities.Student;
import com.example.databasetesting.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/saveNewStudent")
    public Student saveNewStudent(@RequestBody StudentRequest request) {
        return studentRepository.save(request.getStudent());
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    /**
     *
     * Get is simple just use url
     *
     * For post add body containing this
     * [
     *     {
     *         "id": 1,
     *         "firstName": "rv",
     *         "lastName": "rew",
     *         "gpa": 4,
     *         "products": [
     *             {
     *                 "pid": 100,
     *                 "productName": "ABLE",
     *                 "qty": 2,
     *                 "price": 40
     *             },
     *             {
     *                 "pid": 200,
     *                 "productName": "NOT",
     *                 "qty": 4,
     *                 "price": 20
     *             }
     *         ]
     *     }
     * ]
     *
     */
}
