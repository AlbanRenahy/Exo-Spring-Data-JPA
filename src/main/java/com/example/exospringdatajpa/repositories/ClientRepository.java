package com.example.exospringdatajpa.repositories;

import com.example.exospringdatajpa.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepository  extends JpaRepository<Client, Long> {

}
