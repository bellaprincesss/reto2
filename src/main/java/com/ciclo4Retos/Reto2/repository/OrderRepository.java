package com.ciclo4Retos.Reto2.repository;

import com.ciclo4Retos.Reto2.model.Order;
import com.ciclo4Retos.Reto2.repository.crud.OrderCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author 
 * @version 11.0.12
 */
@Repository
public class OrderRepository {
    @Autowired
    private OrderCrudRepository orderCrudRepository;

    public List<Order> getAll(){
        return (List<Order>) orderCrudRepository.findAll();
    }

    public Optional<Order> getOrder(int id){
        return orderCrudRepository.findById(id);
    }

    public Order create(Order order){
        return orderCrudRepository.save(order);
    }

    public void update(Order order){
        orderCrudRepository.save(order);
    }

    public void delete(Order order){
        orderCrudRepository.delete(order);
    }

    public List<Order> getOrderByZone(String zone){
        return orderCrudRepository.findBySalesManZone(zone);
    }

    public List<Order> getOrderBySalesManId(Integer salesManId){
        return orderCrudRepository.findBySalesManId(salesManId);
    }

    public List<Order> getOrderByStatusAndSalesManId(String status, Integer salesManId){
        return orderCrudRepository.findByStatusAndSalesManId(status, salesManId);
    }

    public List<Order> getOrderByRegisterDayAndSalesManId(String registerDay, Integer salesManId){
        try {
            return orderCrudRepository.findByRegisterDayAndSalesManId(new SimpleDateFormat("yyyy-MM-dd").parse(registerDay), salesManId);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }

    }
}
