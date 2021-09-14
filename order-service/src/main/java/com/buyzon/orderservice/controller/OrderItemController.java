package com.buyzon.orderservice.controller;

import com.buyzon.orderservice.model.OrderItem;
import com.buyzon.orderservice.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderItem")
public class OrderItemController {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @GetMapping("/")
    public List<OrderItem> getOrderItems() {
        return orderItemRepository.findAll();
    }

}
