package com.eoi.springboot.controllers;

/* CLASE INICIAL
import org.springframework.web.bind.annotation.RequestMapping;

public class ControladorUsuarios {
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
}*/


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Controlador usuarios.
 */
@RestController
@Log4j2
public class ControladorUsuarios {
    @Value("${mensaje.hola}")
    private String mensajeHola;

    @Value("${mensaje.pastillas}")
    private String mensajemiMedicacion;

    /**
     * Hola string.
     *
     * @return the string
     */
    @GetMapping("${url.hola}")
    String hola() {
        log.warn(mensajeHola);
        return mensajeHola;
    }

    /**
     * Mi medicacion string.
     *
     * @return the string
     */
    @GetMapping("${url.pastillas}")
    String miMedicacion() {
        log.warn(mensajemiMedicacion);
        return mensajemiMedicacion;
    }

}
