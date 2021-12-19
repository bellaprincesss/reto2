package com.ciclo4Retos.Reto2.controller;

import com.ciclo4Retos.Reto2.model.Footwears;
import com.ciclo4Retos.Reto2.service.FootwearsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author 
 * @version 11.0.12
 */
@RestController
@RequestMapping("/api/accessory")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class FootwearsController {

    @Autowired
    private FootwearsService footwearsService;

    @GetMapping("/all")
    public List<Footwears> getAll(){
        return footwearsService.getAll();
    }

    @GetMapping("/{reference}")
    public Optional<Footwears> getFootwears(@PathVariable("reference") String reference){
        return footwearsService.getFootwears(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Footwears create(@RequestBody Footwears gadget){
        return footwearsService.create(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Footwears update(@RequestBody Footwears gadget){
        return  footwearsService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference){
        return  footwearsService.delete(reference);
    }

    @GetMapping("/price/{price}")
    public List<Footwears> getByPrice(@PathVariable("price") double price){
        return footwearsService.getByPrice(price);
    }

    @GetMapping("/description/{description}")
    public List<Footwears> getByDescriptionContains(@PathVariable("description") String description){
        return footwearsService.getByDescriptionContains(description);
    }
}
