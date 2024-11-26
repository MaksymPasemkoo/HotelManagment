package com.ltp.hotelmanagment.service;

import com.ltp.hotelmanagment.model.Hotel;
import com.ltp.hotelmanagment.model.dto.HotelDTO;
import com.ltp.hotelmanagment.repository.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepo hotelRepo;

    public void saveOrUpdateHotel(HotelDTO hotelDTO) {
        Hotel hotel = new Hotel(hotelDTO.getHotelName());
        hotelRepo.save(hotel);
    }

    public List<Hotel> getAllHotels() {
        return hotelRepo.findAll();
    }

    public Hotel getHotelById(Long id) {
        return hotelRepo.findById(id).orElse(null);
    }

    public void deleteHotelById(Long id) {
        hotelRepo.deleteById(id);
    }

    public boolean hotelExists(Long id) {
        return hotelRepo.existsById(id);
    }
}
