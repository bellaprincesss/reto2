package com.ciclo4Retos.Reto2.repository.crud;

import com.ciclo4Retos.Reto2.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

/**
 *
 * @author
 * @version 11.0.12
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer> {

    List<Order> findBySalesManZone(String zone);
    List<Order> findBySalesManId(Integer salesManId);
    List<Order> findByStatusAndSalesManId(String status, Integer salesManId);
    List<Order> findByRegisterDayAndSalesManId(Date registerDay, Integer salesManId);
}
