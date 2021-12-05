package com.example.databasetesting.jpa.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StuProResponse {
    private String firstName;
    private String productName;

    /*
    Note if you want more variables but some of them optional,
    YOU MUST create a new constructor for the ones you just want
    Since remember in repo, we create new instance of this class.
    Therefore we need appropriate constructors
     */
}
