package com.example.vuespringpjt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Docker + Jenkins Error
@MapperScan("com.example.vuespringpjt.work.mapper")
///////////////////////////////////////////////////
@SpringBootApplication
public class VueSpringPjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueSpringPjtApplication.class, args);
	}

}



