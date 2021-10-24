package com.buyzon.userservice;

import com.buyzon.userservice.model.User;
import com.buyzon.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class UserServiceApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("Lucy", "Shawn", "234", "lucy@gmail.com");
        User user2 = new User("John", "Wick", "543", "john@gmail.com");

        userService.createUser(user1);
        userService.createUser(user2);
    }

    @Bean
    public BCryptPasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
