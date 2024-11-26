package com.ltp.hotelmanagment.model.dto;

public class HotelDTO {
    private String hotelName;

    public HotelDTO(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
