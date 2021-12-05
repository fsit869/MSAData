package com.example.databasetesting.jpa.controller;

import com.example.databasetesting.jpa.dto.StudentRequest;
import com.example.databasetesting.jpa.entities.Major;
import com.example.databasetesting.jpa.entities.Student;
import com.example.databasetesting.jpa.repository.MajorRepository;
import com.example.databasetesting.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private MajorRepository majorRepository;


    // Could also use @request mapping to simplify it all?
    @PostMapping("/saveNewStudent")
    public Student saveNewStudent(@RequestBody StudentRequest request) {
        Integer maj_id = request.getStudent().getMajor().getMaj_id();
        Optional<Major> major = majorRepository.findById(maj_id);
        if (major.isEmpty()) {
            throw new RuntimeException("Major ID NOT FOUND");
        } else {
            request.getStudent().setMajor(major.get());
        }
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
     * {
     *     "student": {
     *         "firstName": "TWO",
     *         "lastName": "YESS",
     *         "gpa": 4
     *     }
     * }
     *
     *
     */
}
