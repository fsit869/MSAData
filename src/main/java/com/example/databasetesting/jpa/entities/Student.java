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
@Table(name = "student_table") // This names the table
public class Student {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int id;

    @Column(name="fooName") // This names a column away from default
    private String firstName;
    private String lastName; // By default this will get named last_name
    @Column(nullable = false)
    private int gpa;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "student_table_clubs",
            joinColumns = @JoinColumn(name = "student_re"),
            inverseJoinColumns = @JoinColumn(name = "clubs_id"))
    private List<Club> clubs = new ArrayList<>();

    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }
}
