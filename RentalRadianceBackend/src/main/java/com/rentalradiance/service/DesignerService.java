package com.rentalradiance.service;

import com.rentalradiance.model.Designer;
import com.rentalradiance.repository.DesignerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignerService {

    @Autowired
    private DesignerRepository designerRepository;

    public List<Designer> getAllDesigners() {
        return designerRepository.findAll();
    }

    public Designer saveDesigner(Designer designer) {
        return designerRepository.save(designer);
    }
}
