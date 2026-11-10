package com.rentalradiance.repository;

import com.rentalradiance.model.Dress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DressRepository extends JpaRepository<Dress, Long> {}
