package com.ensi.ilsi.TechnicalTestService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
//@EnableCircuitBreaker
@SpringBootApplication
public class TechnicalTestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnicalTestServiceApplication.class, args);
	}
}
