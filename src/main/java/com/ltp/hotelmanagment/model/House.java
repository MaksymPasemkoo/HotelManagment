package com.ltp.hotelmanagment.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long houseId;
    private String houseCondition;
    private int personInHouse;
    @ElementCollection
    private final List<String> houseAmenities = Amenities.getHouseAmenities(houseCondition);
    @ManyToOne
    private Hotel hotel;

    public House(String houseCondition, int personInHouse, Hotel hotel) {
        this.houseCondition = houseCondition;
        this.personInHouse = personInHouse;
        this.hotel = hotel;
    }

    public House() {
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public String getHouseCondition() {
        return houseCondition;
    }

    public void setHouseCondition(String houseCondition) {
        this.houseCondition = houseCondition;
    }

    public int getPersonInHouse() {
        return personInHouse;
    }

    public void setPersonInHouse(int personInHouse) {
        this.personInHouse = personInHouse;
    }

    public List<String> getHouseAmenities() {
        return houseAmenities;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
