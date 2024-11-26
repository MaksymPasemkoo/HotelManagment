package com.ltp.hotelmanagment.repository;

import com.ltp.hotelmanagment.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel,Long> {

}
