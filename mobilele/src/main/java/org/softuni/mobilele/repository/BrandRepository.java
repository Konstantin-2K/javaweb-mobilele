package org.softuni.mobilele.repository;

import org.softuni.mobilele.model.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository  extends JpaRepository<BrandEntity, Long> {
}
