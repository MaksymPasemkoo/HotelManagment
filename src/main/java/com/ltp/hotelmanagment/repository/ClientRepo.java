package com.ltp.hotelmanagment.repository;

import com.ltp.hotelmanagment.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client,Long> {
}
