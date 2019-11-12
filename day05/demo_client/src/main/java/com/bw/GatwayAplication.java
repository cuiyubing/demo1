package com.bw;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class GatwayAplication {
    public static void main(String[] args) {
        SpringApplication.run(GatwayAplication.class,args);
        }


}
