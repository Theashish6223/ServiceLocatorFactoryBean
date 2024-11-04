package com.ashish.springdemo;

import com.ashish.springdemo.service.DataConverterService;
import com.ashish.springdemo.servicelocator.config.DataConverterFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);

	}

}
