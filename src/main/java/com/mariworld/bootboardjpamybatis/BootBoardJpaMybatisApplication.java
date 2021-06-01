package com.mariworld.bootboardjpamybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BootBoardJpaMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootBoardJpaMybatisApplication.class, args);
	}

}
