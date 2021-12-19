package com.ciclo4Retos.Reto2.repository.crud;

import com.ciclo4Retos.Reto2.model.Footwears;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 *
 * @author 
 * @version 11.0.12
 */
public interface FootwearsCrudRepository extends MongoRepository<Footwears, String> {
    public List<Footwears> findByPrice(double price);
    public List<Footwears> findByDescriptionContainingIgnoreCase(String description);

}
