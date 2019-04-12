package com.xiejinhua.zookeeperTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZookeeperTestApplication.class, args);
	}

}

