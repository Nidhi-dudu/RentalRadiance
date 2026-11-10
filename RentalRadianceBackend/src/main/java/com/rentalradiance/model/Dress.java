package com.rentalradiance.model;

import jakarta.persistence.*;

@Entity
public class Dress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String size;
    private double price;
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "designer_id")
    private Designer designer;

    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public Designer getDesigner() { return designer; }
    public void setDesigner(Designer designer) { this.designer = designer; }
}
