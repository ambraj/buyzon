package com.buyzon.productservice;

import com.buyzon.productservice.vo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class ProductServiceApplication {

    private static WebClient webClient = WebClient.builder().baseUrl("http://localhost:9001")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();

    @PostConstruct
    public void init() {

        System.out.println("..............sending request");
        List<User> users = webClient.get().uri("/user/").retrieve().bodyToFlux(User.class).collectList().block();
        for (User user : users) {
            System.out.println(user);
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
