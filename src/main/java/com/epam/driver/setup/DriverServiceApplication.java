package com.epam.driver.setup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DriverServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(DriverServiceApplication.class, args);
	}

}
