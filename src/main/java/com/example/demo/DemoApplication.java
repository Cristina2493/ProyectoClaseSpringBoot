package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //haz tu magia
@RestController //Anotaciones para evitar escribir código.
//Le dice a Spring que la clase contiene un controlador rest - prepárate para recibir HTTP
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/") //Solicitud
	String hellow(){
		return "Hello World!";
	}

	@RequestMapping("/hola")
	String holam(){
		return "Hola Mundo!";
	}

	@RequestMapping("/mimedicacion") //Solicitud
	String mimedicacion(){
		return "Tómate las pastillas";
	}
}
