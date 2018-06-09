package com.tplan.tpaneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableEurekaServer
@EnableHystrix
@SpringBootApplication
public class TpanEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpanEurekaServerApplication.class, args);
	}
}
