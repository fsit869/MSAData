package com.example.databasetesting.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "major")
public class Major {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    private String title;

}