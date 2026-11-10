package com.rentalradiance.controller;

import com.rentalradiance.model.Dress;
import com.rentalradiance.service.DressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dresses")
public class DressController {

    @Autowired
    private DressService dressService;

    @GetMapping
    public List<Dress> getAll() {
        return dressService.getAllDresses();
    }

    @GetMapping("/{id}")
    public Dress getOne(@PathVariable Long id) {
        return dressService.getDressById(id);
    }

    @PostMapping
    public Dress create(@RequestBody Dress dress) {
        return dressService.saveDress(dress);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        dressService.deleteDress(id);
    }
}
