# BUYZON

### DB Schema
![db_schema](https://user-images.githubusercontent.com/3887992/132411664-43a4b83f-f312-487b-b1f5-4280b9b90501.png)

#### List of Microservices-
* user-service -> done
* product-service
* category-service
* order-service
* cart-service
* rating-service

*Covers following topics -*
* service-registry EUREKA -> done
* API-gateway
* circuit-breaker
* spring default cache
* Exception Handling
* Security/Authorization
* Load balancing

### Technology Stack
Backend -
* Spring Boot
* H2 Database(for now)
* Docker
* AWS
* CI/CD Pipeline

Frontend -
* ReactJS

### Spring Cloud Config Server

* reload configuration at client service from config server
*@RefreshScope* - this annotation enables an endpoint /refresh by which we can reload the configuration
![image](https://user-images.githubusercontent.com/3887992/132410973-9d2dada4-fca6-49d4-9a15-90cdae7ddc7d.png)

* set default branch of git where property file is placed
![image](https://user-images.githubusercontent.com/3887992/132409856-6a3444a8-b75d-4e93-9221-ffd5f5c6edcd.png)

* Verify whether configuration is loaded or not
![image](https://user-images.githubusercontent.com/3887992/132409940-c0ba8fcd-0de2-4da2-b653-c39f626624dc.png)

### Random Notes on Microservices
* To load bootstrap.yml
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bootstrap</artifactId>
</dependency>
```
