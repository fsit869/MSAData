package com.example.databasetesting.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clubs")
public class Clubs {
    @Id
    @Column(name = "id", nullable = false)
    private String club_id;

    private String clubTitle;

}