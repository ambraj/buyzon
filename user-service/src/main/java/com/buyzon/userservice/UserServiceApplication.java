package com.buyzon.userservice;

import com.buyzon.userservice.model.Address;
import com.buyzon.userservice.model.User;
import com.buyzon.userservice.repository.AddressRepository;
import com.buyzon.userservice.repository.UserRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("Lucy", "Shawn", "lucy@gmail.com");
        User user2 = new User("John", "Wick", "john@gmail.com");

        Address address = new Address("Home", "address 1", "address 2", 201309, "Noida", 888888888, user1);

        userRepository.save(user1);
        userRepository.save(user2);

        addressRepository.save(address);
    }
}
