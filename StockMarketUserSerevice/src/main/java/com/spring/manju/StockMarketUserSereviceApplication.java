package com.spring.manju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StockMarketUserSereviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMarketUserSereviceApplication.class, args);
	}

}
