package com.cong.springsmstudentsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringSmStudentsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSmStudentsServiceApplication.class, args);
    }

}
