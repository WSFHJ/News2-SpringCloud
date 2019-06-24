package com.yq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(value="com.yq.news.mapper")
public class EditNewApp {

	public static void main(String[] args) {
		SpringApplication.run(EditNewApp.class, args);
	}
	
}
