package com.example.PC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class PcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcApplication.class, args);
	}

}
