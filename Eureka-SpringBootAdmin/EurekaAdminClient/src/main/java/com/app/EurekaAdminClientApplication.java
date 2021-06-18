package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaAdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaAdminClientApplication.class, args);
    }

}