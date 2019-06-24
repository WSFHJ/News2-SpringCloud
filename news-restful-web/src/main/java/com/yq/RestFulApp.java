package com.yq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestFulApp {
	public static void main(String[] args) {
	  SpringApplication.run(RestFulApp.class, args);	
	}
	
	// 创建出restTemplate 对象  并交给spring 容器去管理
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
}




