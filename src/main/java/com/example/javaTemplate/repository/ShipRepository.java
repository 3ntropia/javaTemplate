package com.example.javaTemplate.repository;

import com.example.javaTemplate.daos.ShipDAO;
import com.example.javaTemplate.domain.Ship;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ShipRepository extends MongoRepository<ShipDAO, String> {

    ShipDAO findByFirstName(String firstName);
    List<ShipDAO> findByLastName(String lastName);
}
