# BUYZON

Notes - 

*Spring Cloud Cconfig Server :*

* reload configuration at client service from config server
*@RefreshScope* - this annotation enables an endpoint /refresh by which we can reload the configuration
![image](https://user-images.githubusercontent.com/3887992/132410973-9d2dada4-fca6-49d4-9a15-90cdae7ddc7d.png)


* set default branch of git where property file is placed
![image](https://user-images.githubusercontent.com/3887992/132409856-6a3444a8-b75d-4e93-9221-ffd5f5c6edcd.png)

* Verify whether configuration is loaded or not
![image](https://user-images.githubusercontent.com/3887992/132409940-c0ba8fcd-0de2-4da2-b653-c39f626624dc.png)

* To load bootstrap.yml
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bootstrap</artifactId>
</dependency>
```
