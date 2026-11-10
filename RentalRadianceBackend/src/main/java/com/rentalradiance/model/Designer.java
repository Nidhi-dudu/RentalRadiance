package com.rentalradiance.model;

import jakarta.persistence.*;

@Entity
public class Designer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    // Getters and setters
}
