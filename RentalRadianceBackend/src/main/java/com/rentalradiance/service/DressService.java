package com.rentalradiance.service;

import com.rentalradiance.model.Dress;
import com.rentalradiance.repository.DressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DressService {

    @Autowired
    private DressRepository dressRepository;

    public List<Dress> getAllDresses() {
        return dressRepository.findAll();
    }

    public Dress saveDress(Dress dress) {
        return dressRepository.save(dress);
    }

    public void deleteDress(Long id) {
        dressRepository.deleteById(id);
    }

    public Dress getDressById(Long id) {
        return dressRepository.findById(id).orElse(null);
    }
}
