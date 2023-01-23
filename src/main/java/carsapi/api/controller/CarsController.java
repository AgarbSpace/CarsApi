package carsapi.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import carsapi.api.DTO.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
    
    @PostMapping
    public CarDTO create(@RequestBody CarDTO req) {
        return req;
    }
}
