package com.ltp.hotelmanagment.repository;

import com.ltp.hotelmanagment.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation,Long> {
}
