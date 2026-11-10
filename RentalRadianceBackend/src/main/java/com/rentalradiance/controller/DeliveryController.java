package com.rentalradiance.controller;

import com.rentalradiance.model.Delivery;
import com.rentalradiance.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping
    public List<Delivery> getAll() {
        return deliveryService.getAllDeliveries();
    }

    @PostMapping
    public Delivery create(@RequestBody Delivery delivery) {
        return deliveryService.saveDelivery(delivery);
    }
}
