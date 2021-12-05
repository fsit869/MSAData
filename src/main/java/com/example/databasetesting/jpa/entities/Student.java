package com.example.databasetesting.jpa.entities;

import lombok.*;

import javax.persistence.*;
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

    @Column(name="fooName") // This names a column away from default, HOWEVER when get request its still named firstName
    private String firstName;
    private String lastName; // By default this will get named last_name
    private int gpa;



    /*
        Student has multiple products.
        You must look from prespective of class. A student obj, has a list of products

        Cascade = When deleted, how does it delete? Everything? or just this obj and not products?
        Join column name, is name of foreign key. LOOK AT ONENOTE DIAGRAM
        Join refColumnName is, where is the foreign key mapped too?
     */
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name="stu_fk", referencedColumnName = "id")
    private List<Product> products;
}
