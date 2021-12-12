package com.ciclo4Retos.Reto2.service;

import com.ciclo4Retos.Reto2.model.Footwears;
import com.ciclo4Retos.Reto2.repository.FootwearsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FootwearsService {

    @Autowired
    private FootwearsRepository footwearsRepository;

    public List<Footwears> getAll() {
        return footwearsRepository.getAll();
    }

    public Optional<Footwears> getFootwears(String reference) {
        return footwearsRepository.getFootwears(reference);
    }

    public Footwears save(Footwears footwears) {
        if (footwears.getReference() == null) {
            return footwears;
        } else {
            return footwearsRepository.create(footwears);
        }
    }

    public Footwears update(Footwears footwears) {

        if (footwears.getReference() != null) {
            Optional<Footwears> dbFootwears = footwearsRepository.getFootwears(footwears.getReference());
            if (!dbFootwears.isEmpty()) {

                if (footwears.getBrand()!= null) {
                    dbFootwears.get().setBrand(footwears.getBrand());
                }

                if (footwears.getCategory() != null) {
                    dbFootwears.get().setCategory(footwears.getCategory());
                }

                if (footwears.getMaterial() != null) {
                    dbFootwears.get().setMaterial(footwears.getMaterial());
                }

                if (footwears.getGender() != null) {
                    dbFootwears.get().setGender(footwears.getGender());
                }

                if (footwears.getSize() != null) {
                    dbFootwears.get().setSize(footwears.getSize());
                }

                if (footwears.getDescription() != null) {
                    dbFootwears.get().setDescription(footwears.getDescription());
                }
                if (footwears.getPrice() != 0.0) {
                    dbFootwears.get().setPrice(footwears.getPrice());
                }
                if (footwears.getQuantity() != 0) {
                    dbFootwears.get().setQuantity(footwears.getQuantity());
                }
                if (footwears.getPhotography() != null) {
                    dbFootwears.get().setPhotography(footwears.getPhotography());
                }

                dbFootwears.get().setAvailability(footwears.isAvailability());
                footwearsRepository.update(dbFootwears.get());
                return dbFootwears.get();
            } else {
                return footwears;
            }
        } else {
            return footwears;
        }
    }

    public boolean delete(String reference) {
        Boolean aBoolean = getFootwears(reference).map(footwears -> {
            footwearsRepository.delete(footwears);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
