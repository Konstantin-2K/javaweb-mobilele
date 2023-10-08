package org.softuni.mobilele.service;

import org.softuni.mobilele.model.dto.BrandDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrandService {
    List<BrandDTO> getAllBrands();
}
