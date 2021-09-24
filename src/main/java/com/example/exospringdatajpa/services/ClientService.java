package com.example.exospringdatajpa.services;

import com.example.exospringdatajpa.models.Client;
import com.example.exospringdatajpa.models.ClientDTO;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    public List<Client> trouverTousClients();
    public Optional<Client> findById(Long aLong);

    public void deleteById(Long aLong);
    public Client save(Client entity);
    public List<ClientDTO> findDTO();
}
