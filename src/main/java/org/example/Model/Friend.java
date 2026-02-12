package org.example.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


// it tells JPA that the following class represents a table in our database
@Entity

// automatically puts the getter and setter , reducing boiler plate codes
@Data

// Creating an empty constructor hibernate needs.
@NoArgsConstructor

@AllArgsConstructor

public class Friend {

    @Id //primary key for the table

    //this automatically increments ID everytime a new user is saved.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

}
