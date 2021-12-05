package com.example.databasetesting.jpa.controller;

import com.example.databasetesting.jpa.entities.Major;
import com.example.databasetesting.jpa.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MajorController {
    @Autowired
    private MajorRepository majorRepository;

    @GetMapping("/getAllMajors")
    public List<Major> getAllMajors() {
        return majorRepository.findAll();
    }

    @RequestMapping("/newMajor")
    public Major newMajor(@RequestParam("id") int ma_id, @RequestParam("title") String title) {
        Major major = new Major(ma_id, title);
        return majorRepository.save(major);
    }
}
