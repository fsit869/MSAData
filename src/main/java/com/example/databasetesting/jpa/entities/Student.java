package com.example.databasetesting.jpa.entities;

import lombok.*;

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
    private int id;

    @Column(name="fooName") // This names a column away from default
    private String firstName;
    private String lastName; // By default this will get named last_name
    private int gpa;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "student_table_clubby",
            joinColumns = @JoinColumn(name = "student_null"),
            inverseJoinColumns = @JoinColumn(name = "clubby_id"))
    private List<Clubs> clubby = new ArrayList<>();

    public List<Clubs> getClubby() {
        return clubby;
    }

    public void setClubby(List<Clubs> clubby) {
        this.clubby = clubby;
    }
}
