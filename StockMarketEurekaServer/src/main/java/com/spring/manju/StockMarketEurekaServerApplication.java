package com.spring.manju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class StockMarketEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMarketEurekaServerApplication.class, args);
	}

}
