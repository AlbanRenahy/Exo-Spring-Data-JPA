package com.example.exospringdatajpa.config;

import com.example.exospringdatajpa.repositories.ClientRepository;
import com.example.exospringdatajpa.repositories.CustomClientRepository;
import com.example.exospringdatajpa.repositories.CustomClientRepositoryImpl;
import com.example.exospringdatajpa.services.ClientService;
import com.example.exospringdatajpa.services.ClientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class ClientConfig {

    @Bean
    public ClientService clientService(ClientRepository repo, CustomClientRepository customRepo){
        return new ClientServiceImpl(repo, customRepo);
    }

    @Bean
    public CustomClientRepository customClientRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        return new CustomClientRepositoryImpl(jdbcTemplate);
    }
}
