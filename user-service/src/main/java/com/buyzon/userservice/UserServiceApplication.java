package com.buyzon.userservice;

import com.buyzon.userservice.model.User;
import com.buyzon.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class UserServiceApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("Lucy", "Shawn", "234", "lucy@gmail.com");
        User user2 = new User("John", "Wick", "543", "john@gmail.com");

        userRepository.save(user1);
        userRepository.save(user2);
    }
}
