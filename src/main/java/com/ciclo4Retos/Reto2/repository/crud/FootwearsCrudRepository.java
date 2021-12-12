package com.ciclo4Retos.Reto2.repository.crud;

import com.ciclo4Retos.Reto2.model.Footwears;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FootwearsCrudRepository extends MongoRepository<Footwears, String> {
}
