package com.ciclo4Retos.Reto2.repository.crud;

import com.ciclo4Retos.Reto2.model.Footwears;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Nadia
 * @version 11.0.12
 */
public interface FootwearsCrudRepository extends MongoRepository<Footwears, String> {
}