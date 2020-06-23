package com.njweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewaydemoApplication {

	public static void main(String[] args) {
		System.out.println("我是网关0000000");
		SpringApplication.run(GatewaydemoApplication.class, args);
	}

}
