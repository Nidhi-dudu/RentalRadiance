package com.rentalradiance.model;

import jakarta.persistence.*;

@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String deliveryPerson;
    private String status;

    // Getters and setters
}
