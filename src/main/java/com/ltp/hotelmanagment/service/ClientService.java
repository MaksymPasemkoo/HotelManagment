package com.ltp.hotelmanagment.service;


import com.ltp.hotelmanagment.model.Client;
import com.ltp.hotelmanagment.model.dto.ClientDTO;
import com.ltp.hotelmanagment.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepo clientRepo;

    public Client addOrUpdateClient(ClientDTO clientDTO) {
        Client client = new Client();
        client.setName(clientDTO.getName());
        return clientRepo.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepo.findAll();
    }

    public Client getClientById(Long id) {
        return clientRepo.findById(id).orElse(null);
    }

    public void deleteClient(Long id) {
        clientRepo.deleteById(id);
    }
}

