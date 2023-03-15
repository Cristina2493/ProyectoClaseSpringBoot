package com.eoi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //haz tu magia
@RestController //Anotaciones para evitar escribir código.
//Le dice a Spring que la clase contiene un controlador rest - prepárate para recibir HTTP
public class MySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}


}
