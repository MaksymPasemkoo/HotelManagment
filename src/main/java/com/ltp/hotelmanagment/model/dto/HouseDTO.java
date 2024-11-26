package com.ltp.hotelmanagment.model.dto;

public class HouseDTO {
    private Long hotelId;
    private String houseCondition;
    private int personInHouse;

    public HouseDTO(Long hotelId, String houseCondition, int personInHouse) {
        this.hotelId = hotelId;
        this.houseCondition = houseCondition;
        this.personInHouse = personInHouse;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
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
}
