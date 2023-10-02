package org.softuni.mobilele.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "brands")
public class BrandEntity extends BaseEntity{
    @Column(unique = true, nullable = false)
    private String brand;

    @Enumerated(EnumType.STRING)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
