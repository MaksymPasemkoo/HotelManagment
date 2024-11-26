package com.ltp.hotelmanagment.repository;

import com.ltp.hotelmanagment.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepo extends JpaRepository<House,Long> {
}
