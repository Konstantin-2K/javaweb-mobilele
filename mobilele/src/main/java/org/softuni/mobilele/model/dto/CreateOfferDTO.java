package org.softuni.mobilele.model.dto;

import org.softuni.mobilele.model.entity.enums.Engine;
import org.softuni.mobilele.model.entity.enums.Transmission;

public record CreateOfferDTO(
        String description,
        String modelId,
        Engine engine,
        Transmission transmission,
        String imageUrl,
        Integer mileage,
        Integer price,
        Integer year
) {
}
