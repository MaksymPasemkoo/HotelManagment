package com.ltp.hotelmanagment.controller;


import com.ltp.hotelmanagment.model.Hotel;
import com.ltp.hotelmanagment.model.dto.HotelDTO;
import com.ltp.hotelmanagment.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping
    public String saveHotel(@RequestBody HotelDTO hotelDTO) {
        hotelService.saveOrUpdateHotel(hotelDTO);
        return "Added";
    }

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @PutMapping
    public String updateHotel(@RequestBody HotelDTO hotelDTO) {
        hotelService.saveOrUpdateHotel(hotelDTO);
        return "Updated";
    }

    @GetMapping("/{id}")
    public Hotel getHotelById(@PathVariable Long id) {
        return hotelService.getHotelById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteHotelById(@PathVariable Long id) {
        hotelService.deleteHotelById(id);
    }

    @GetMapping("/exists/{id}")
    public boolean hotelExists(@PathVariable Long id) {
        return hotelService.hotelExists(id);
    }

}
