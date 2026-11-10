package com.rentalradiance.controller;

import com.rentalradiance.model.Designer;
import com.rentalradiance.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/designers")
public class DesignerController {

    @Autowired
    private DesignerService designerService;

    @GetMapping
    public List<Designer> getAll() {
        return designerService.getAllDesigners();
    }

    @PostMapping
    public Designer create(@RequestBody Designer designer) {
        return designerService.saveDesigner(designer);
    }
}
