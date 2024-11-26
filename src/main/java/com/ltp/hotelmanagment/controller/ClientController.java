package com.ltp.hotelmanagment.controller;


import com.ltp.hotelmanagment.model.Client;
import com.ltp.hotelmanagment.model.dto.ClientDTO;
import com.ltp.hotelmanagment.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public void addClient(@RequestBody ClientDTO clientDTO) {
        clientService.addOrUpdateClient(clientDTO);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        Client client = clientService.getClientById(id);
        if (client == null) {
            throw new RuntimeException("Client not found");
        }
        return client;
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        Client client = clientService.getClientById(id);
        if (client == null) {
            throw new RuntimeException("Client not found");
        }
        clientService.deleteClient(id);
    }
}

