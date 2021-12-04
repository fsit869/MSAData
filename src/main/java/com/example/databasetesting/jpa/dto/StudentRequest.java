package com.example.databasetesting.jpa.dto;

import com.example.databasetesting.jpa.entities.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentRequest {
    private Student student;
}
