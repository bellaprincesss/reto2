package com.ciclo4Retos.Reto2.repository.crud;

import com.ciclo4Retos.Reto2.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 *
 * @author Nadia
 * @version 11.0.12
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer> {

    List<Order> findBySalesManZone(String zone);
}
