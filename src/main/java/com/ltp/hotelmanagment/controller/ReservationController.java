package com.ltp.hotelmanagment.controller;


import com.ltp.hotelmanagment.model.Reservation;
import com.ltp.hotelmanagment.model.dto.ReservationDTO;
import com.ltp.hotelmanagment.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public String addReservation(@RequestBody ReservationDTO reservationDTO) {
        reservationService.addOrUpdateReservation(reservationDTO);
        return "Reservation added successfully!";
    }

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PutMapping
    public String updateReservation(@RequestBody ReservationDTO reservationDTO) {
        reservationService.addOrUpdateReservation(reservationDTO);
        return "Reservation added successfully!";
    }
    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        Reservation reservation = reservationService.getReservationById(id);
        if (reservation == null) {
            throw new RuntimeException("Reservation not found with id: " + id);
        }
        return reservation;
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id) {
        Reservation reservation = reservationService.getReservationById(id);
        if (reservation == null) {
            throw new RuntimeException("Reservation not found with id: " + id);
        }
        reservationService.deleteReservation(id);
    }
}

