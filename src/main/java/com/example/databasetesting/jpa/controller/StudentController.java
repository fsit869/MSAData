package com.example.databasetesting.jpa.controller;

import com.example.databasetesting.jpa.dto.StudentRequest;
import com.example.databasetesting.jpa.entities.Student;
import com.example.databasetesting.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/newStudentMeth2" )
    public Student saveNewStudent(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("gpa") int gpa
    ) {
        Student stu = new Student(firstName, lastName, gpa);
        return studentRepository.save(stu);
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
