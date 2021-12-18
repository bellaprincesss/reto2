package com.ciclo4Retos.Reto2.repository;

import com.ciclo4Retos.Reto2.model.Footwears;
import com.ciclo4Retos.Reto2.repository.crud.FootwearsCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Nadia
 * @version 11.0.12
 */
@Repository
public class FootwearsRepository {

    @Autowired
    private FootwearsCrudRepository footwearsCrudRepository;

    public List<Footwears> getAll() {
        return footwearsCrudRepository.findAll();
    }

    public Optional<Footwears> getFootwears(String reference) {
        return footwearsCrudRepository.findById(reference);
    }
    public Footwears create(Footwears footwears) {
        return footwearsCrudRepository.save(footwears);
    }

    public void update(Footwears footwears) {
        footwearsCrudRepository.save(footwears);
    }

    public void delete(Footwears footwears) {
        footwearsCrudRepository.delete(footwears);
    }

    public List<Footwears> getByPrice(double price){
        return footwearsCrudRepository.findByPrice(price);
    }

    public List<Footwears> getByDescriptionContains(String description){
        return footwearsCrudRepository.findByDescriptionContainingIgnoreCase(description);
    }
}
