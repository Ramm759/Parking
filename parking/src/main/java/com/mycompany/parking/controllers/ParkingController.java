package com.mycompany.parking.controllers;

import com.mycompany.parking.models.Parking;
import com.mycompany.parking.services.ParkingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingController {
    @Autowired
    private ParkingServiceInterface parkingService;

    @GetMapping("/api/parkingsList")
    public List<Parking> getListParkings() {
        return parkingService.getListParkings();
    }
}
