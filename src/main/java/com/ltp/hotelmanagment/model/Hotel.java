package com.ltp.hotelmanagment.model;

import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelId;
    private String hotelName;
    @ElementCollection
    private final List<String> hotelAmenities = Amenities.getHotelAmenities();
    @ElementCollection
    private final List<String> listOfReservation = new ArrayList<>();

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }

    public Hotel() {

    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<String> getHotelAmenities() {
        return hotelAmenities;
    }

}
