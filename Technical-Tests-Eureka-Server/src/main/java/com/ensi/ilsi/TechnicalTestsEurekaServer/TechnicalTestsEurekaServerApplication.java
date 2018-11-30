package com.ensi.ilsi.TechnicalTestsEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;;


@EnableEurekaServer
@SpringBootApplication
public class TechnicalTestsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnicalTestsEurekaServerApplication.class, args);
	}
}
