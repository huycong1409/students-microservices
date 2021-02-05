package com.cong.springsmconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringSmConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSmConfigServerApplication.class, args);
    }

}
