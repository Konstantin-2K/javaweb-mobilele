package org.softuni.mobilele.service;

import org.softuni.mobilele.model.dto.CreateOfferDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface OfferService {
    UUID createOffer(CreateOfferDTO createOfferDTO);
}
