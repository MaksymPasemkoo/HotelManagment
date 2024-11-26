package com.ltp.hotelmanagment.service;


import com.ltp.hotelmanagment.model.Client;
import com.ltp.hotelmanagment.model.House;
import com.ltp.hotelmanagment.model.Reservation;
import com.ltp.hotelmanagment.model.dto.ReservationDTO;
import com.ltp.hotelmanagment.repository.ClientRepo;
import com.ltp.hotelmanagment.repository.HouseRepo;
import com.ltp.hotelmanagment.repository.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepo reservationRepo;

    @Autowired
    private HouseRepo houseRepo;

    @Autowired
    private ClientRepo clientRepo;

    public Reservation addOrUpdateReservation(ReservationDTO reservationDTO) {
        House house = houseRepo.findById(reservationDTO.getHouseId()).orElse(null);
        Client client = clientRepo.findById(reservationDTO.getClientId()).orElse(null);

        if (house != null && client != null) {
            Reservation reservation = new Reservation(house, client, reservationDTO.getDate());
            return reservationRepo.save(reservation);
        }
        throw new RuntimeException("House or Client not found with provided IDs.");
    }

    public List<Reservation> getAllReservations() {
        return reservationRepo.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepo.findById(id).orElse(null); // Return reservation by ID
    }

    public void deleteReservation(Long id) {
        Reservation reservation = reservationRepo.findById(id).orElse(null);
        if (reservation != null) {
            reservationRepo.delete(reservation);
        } else {
            throw new RuntimeException("Reservation not found with id: " + id);
        }
    }
}

