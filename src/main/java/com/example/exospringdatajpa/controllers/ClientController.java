package com.example.exospringdatajpa.controllers;

import com.example.exospringdatajpa.models.Client;
import com.example.exospringdatajpa.models.ClientDTO;
import com.example.exospringdatajpa.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("clients")
public class ClientController {
    @Autowired
    private ClientService service;

    @GetMapping("")
    public List<Client> trouverTousClients() {
        return service.trouverTousClients();
    }

    @GetMapping("{id}")
    public Optional<Client> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

    @PostMapping("")
    @PutMapping("")
    public Client save(@RequestBody Client entity) {
        return service.save(entity);
    }

    @GetMapping("dto")
    public List<ClientDTO> findDto() {
        return this.service.findDTO();
    }
}
