package com.example.databasetesting.jpa.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_table") // This names the table
public class Student {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="fooName") // This names a column away from default
    private String firstName;
    private String lastName; // By default this will get named last_name
    private int gpa;
}
