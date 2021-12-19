package com.ciclo4Retos.Reto2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author 
 * @version 11.0.12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "footwears")
public class Footwears {

    @Id
    private String reference;
    private String brand;
    private String category;
    private String material;
    private String gender;
    private String size;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
}

