package com.ltp.hotelmanagment.service;


import com.ltp.hotelmanagment.model.Hotel;
import com.ltp.hotelmanagment.model.House;
import com.ltp.hotelmanagment.model.dto.HouseDTO;
import com.ltp.hotelmanagment.repository.HotelRepo;
import com.ltp.hotelmanagment.repository.HouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {

    @Autowired
    private HouseRepo houseRepo;

    @Autowired
    private HotelRepo hotelRepo;


    public House addOrUpdateHouse(HouseDTO houseDTO) {
        Hotel hotel = hotelRepo.findById(houseDTO.getHotelId()).orElse(null);
        if (hotel != null) {
            House house = new House(houseDTO.getHouseCondition(), houseDTO.getPersonInHouse(), hotel);
            return houseRepo.save(house);
        }
        throw new RuntimeException("Hotel not found with id: " + houseDTO.getHotelId());
    }

    public List<House> getAllHouses() {
        return houseRepo.findAll();
    }

    public House getHouseById(Long id) {
        return houseRepo.findById(id).orElse(null);
    }


    public void deleteHouse(Long id) {
        House house = houseRepo.findById(id).orElse(null);
        if (house != null) {
            houseRepo.delete(house);
        } else {
            throw new RuntimeException("House not found with id: " + id);
        }
    }
}

