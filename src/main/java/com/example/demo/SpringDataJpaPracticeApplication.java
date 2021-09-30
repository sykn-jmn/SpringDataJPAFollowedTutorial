package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaPracticeApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Student jeman2 = studentRepository.getById(2L);
		};
	}
}
