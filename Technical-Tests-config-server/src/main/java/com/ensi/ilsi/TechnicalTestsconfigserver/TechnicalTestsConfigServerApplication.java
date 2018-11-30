package com.ensi.ilsi.TechnicalTestsconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class TechnicalTestsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnicalTestsConfigServerApplication.class, args);
	}
}
