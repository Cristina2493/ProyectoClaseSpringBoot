package com.eoi.springboot;

/* CLASE INICIAL
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

}*/

import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.web.bind.annotation.GetMapping;
		import org.springframework.web.bind.annotation.RestController;

/**
 * La Clase MySpringBootApplication, clase padre de la aplicaci&oacute;n SpringBoot
 */
@SpringBootApplication
@RestController
public class MySpringBootApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}

	/**
	 * Hello main  string.
	 *
	 * @return  el string por defecto "Main Class" para testear la aplicación
	 */
	@GetMapping("/")
	String helloMain() {
		return "Main class";
	}

}
