package com.ltp.hotelmanagment.controller;


import com.ltp.hotelmanagment.model.House;
import com.ltp.hotelmanagment.model.dto.HouseDTO;
import com.ltp.hotelmanagment.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @PostMapping
    public String addedHouse(@RequestBody HouseDTO houseDTO) {
        houseService.addOrUpdateHouse(houseDTO);
        return "Added";
    }

    @GetMapping
    public List<House> getAllHouses() {
        return houseService.getAllHouses();
    }

    @PutMapping
    public String updateHouse(@RequestBody HouseDTO houseDTO) {
        houseService.addOrUpdateHouse(houseDTO);
        return "Updated";
    }

    @GetMapping("/{id}")
    public House getHouseById(@PathVariable Long id) {
        House house = houseService.getHouseById(id);
        if (house == null) {
            throw new RuntimeException("House not found with id: " + id);
        }
        return house;
    }

    @DeleteMapping("/{id}")
    public void deleteHouse(@PathVariable Long id) {
        House house = houseService.getHouseById(id);
        if (house == null) {
            throw new RuntimeException("House not found with id: " + id);
        }
        houseService.deleteHouse(id);

    }
}
