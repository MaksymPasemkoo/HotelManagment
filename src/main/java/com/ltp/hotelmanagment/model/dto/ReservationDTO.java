package com.ltp.hotelmanagment.model.dto;

import java.time.LocalDate;

public class ReservationDTO {
    private Long houseId;
    private Long clientId;
    private LocalDate date;

    public ReservationDTO(Long houseId, Long clientId, LocalDate date) {
        this.houseId = houseId;
        this.clientId = clientId;
        this.date = date;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
