package org.softuni.mobilele.service;

import org.softuni.mobilele.model.dto.CreateOfferDTO;
import org.softuni.mobilele.repository.OfferRepository;

import java.util.UUID;

public class OfferServiceImpl implements OfferService{

    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }
    @Override
    public UUID createOffer(CreateOfferDTO createOfferDTO) {
        //todo - create offer
        return null;
    }
}
