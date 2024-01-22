package com.gt.dev.miprimerproyecto;

import data.UserService;
import data.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("data.UserRepository")
public class MiprimerproyectoApplication {

	public static void main(String[] args) {

		SpringApplication.run(MiprimerproyectoApplication.class, args);


	}

}

