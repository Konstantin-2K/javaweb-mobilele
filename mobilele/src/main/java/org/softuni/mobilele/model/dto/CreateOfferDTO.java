package org.softuni.mobilele.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.softuni.mobilele.model.entity.enums.Engine;
import org.softuni.mobilele.model.entity.enums.Transmission;
import org.softuni.mobilele.model.validation.YearNotInFuture;

public record CreateOfferDTO(@NotEmpty @Size(min = 5, max = 512) String description,
                             @Positive @NotNull Long modelId, @NotNull Engine engine,
                             @NotNull Transmission transmission, @NotEmpty String imageUrl,
                             @Positive @NotNull Integer mileage,
                             @Positive @NotNull Integer price,
                             @YearNotInFuture
                             @NotNull(message = "Year must be provided!")
                             @Min(1930)
                             Integer year) {

    public static CreateOfferDTO empty() {
        return new CreateOfferDTO(null, null, null, null, null, null, null, null);
    }
}