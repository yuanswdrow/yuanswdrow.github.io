package com.zcpy.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaDemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaDemoApplication.class).web(true).run(args);
	}
	
}
