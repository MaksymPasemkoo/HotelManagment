package com.ltp.hotelmanagment.model;

import java.util.List;

public class Amenities {
    public static List<String> getHotelAmenities() {
        return List.of("Free Wi-Fi", "Free Parking", "Swimming Pool", "Fitness Center", "Bar", "Restaurant"
                , "Room Service", "Laundry Service", "Spa", "Air Conditioning", "Airport Transfer", "Childcare"
                , "Concierge", "Conference Room",
                "Elevator", "Gym", "Hot Tub", "Non-Smoking", "Pet Friendly", "Wheelchair Accessible");
    }

    public static List<String> getHouseAmenities(String houseCondition) {
        List<String> amenities = null;
        if (houseCondition.equalsIgnoreCase("economy")) {
            amenities = List.of("WiFi", "Air Conditioning", "Heating", "Kitchen", "Refrigerator", "Microwave",
                    "Dishwasher","Bed");
        } else if (houseCondition.equals("standard")) {
            amenities = List.of("WiFi", "Air Conditioning", "Heating", "Kitchen", "Refrigerator", "Microwave",
                    "Dishwasher","Bed", "Washing Machine", "Dryer", "Television", "Garden View");
        } else if (houseCondition.equalsIgnoreCase("luxury")) {
            amenities = List.of("WiFi", "Air Conditioning", "Heating", "Kitchen", "Refrigerator", "Microwave",
                    "Dishwasher","Bed", "Washing Machine", "Dryer", "Television", "Cable TV", "Private Bathroom", "Balcony",
                    "Garden View");
        }
        if(amenities == null){
            throw new IllegalArgumentException("Invalid house condition");
        }
        return amenities;
    }
}
