package com.example.databasetesting.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "club")
public class Club {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @ManyToMany(mappedBy = "clubs", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    private List<Student> students = new ArrayList<>();
}

