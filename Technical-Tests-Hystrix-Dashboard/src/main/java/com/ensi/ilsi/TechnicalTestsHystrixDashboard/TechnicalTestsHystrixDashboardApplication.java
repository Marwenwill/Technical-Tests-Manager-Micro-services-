package com.ensi.ilsi.TechnicalTestsHystrixDashboard;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class TechnicalTestsHystrixDashboardApplication {

	public static void main(String[] args) { SpringApplication.run(TechnicalTestsHystrixDashboardApplication.class, args); }
}
