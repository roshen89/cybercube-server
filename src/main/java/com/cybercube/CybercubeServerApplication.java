package com.cybercube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CybercubeServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(CybercubeServerApplication.class, args);
  }

}
