package com.example.exospringdatajpa.repositories;

import com.example.exospringdatajpa.models.ClientDTO;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomClientRepository {
    public List<ClientDTO> findClientNomPrenom();
}
