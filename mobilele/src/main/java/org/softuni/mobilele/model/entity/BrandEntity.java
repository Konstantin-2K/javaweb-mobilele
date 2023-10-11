package org.softuni.mobilele.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "brands")
public class BrandEntity extends BaseEntity{
    @Column(unique = true, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "brand"
    )
    private List<ModelEntity> models;

    public List<ModelEntity> getModels() {
        return models;
    }

    public BrandEntity setModels(List<ModelEntity> models) {
        this.models = models;
        return this;
    }
}
