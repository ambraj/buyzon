package com.buyzon.orderservice;

import com.buyzon.orderservice.model.Order;
import com.buyzon.orderservice.model.OrderItem;
import com.buyzon.orderservice.repository.OrderItemRepository;
import com.buyzon.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceApplication implements CommandLineRunner {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {

        Order order = new Order(1L, 1L, LocalDateTime.now(), LocalDateTime.now(), "done", 500);

        OrderItem orderItem = new OrderItem(order, 500);

        orderRepository.save(order);
        orderItemRepository.save(orderItem);
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
