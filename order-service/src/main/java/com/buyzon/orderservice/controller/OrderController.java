package com.buyzon.orderservice.controller;

import com.buyzon.orderservice.model.Order;
import com.buyzon.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/")
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

}
