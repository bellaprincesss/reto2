package com.ciclo4Retos.Reto2.controller;

import com.ciclo4Retos.Reto2.model.Order;
import com.ciclo4Retos.Reto2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
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
@RequestMapping("/api/order")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public List<Order> getAll(){
        return orderService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrder(@PathVariable("id") Integer id){
        return orderService.getOrder(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@RequestBody Order order){
        return orderService.create(order);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Order update(@RequestBody Order order){
        return orderService.update(order);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id){
        return orderService.delete(id);
    }

    @GetMapping("/zona/{zone}")
    public  List<Order> getOrdersByZone(@PathVariable("zone") String zone){
        return orderService.getOrderByZone(zone);
    }

    @GetMapping("/salesman/{id}")
    public List<Order> getOrderBySalesManId(@PathVariable("id") Integer id){
        return orderService.getOrderBySalesManId(id);
    }

    @GetMapping("/state/{status}/{salesManId}")
    public List<Order> getOrderByStatusAndSalesManId(@PathVariable("status") String status, @PathVariable("salesManId") Integer salesManId){
        return orderService.getOrderByStatusAndSalesManId(status, salesManId);
    }

    @GetMapping("/date/{registerDay}/{salesManId}")
    public List<Order> getOrderByRegisterDayAndSalesManId(@PathVariable("registerDay") String registerDay, @PathVariable("salesManId")Integer salesManId){
        return orderService.getOrderByRegisterDayAndSalesManId(registerDay, salesManId);
    }

}
