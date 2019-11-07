package com.dianmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author www
 */
@EnableEurekaServer
@SpringBootApplication
public class QxCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(QxCenterApplication.class, args);
	}
}
