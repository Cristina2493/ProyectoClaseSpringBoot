package com.eoi.paradigmasPOO;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Mueble. La clase mueble comprende todos los objetos físicos que tiene una habitación
 * Además todos los objetos de la clase Mueble, tienen un Arraylist de Componentes de Mueble (ComponenteDeMueble.class)
 */
@Component
public abstract class Mueble extends ObjetoFisico {

    /**
     * Se utiliza para guardar el nombre de la habitación en la que se encuentra el mueble
     */
    private String habitacion;

    /**
     * The Componentes.
     */
    protected List<ComponenteDeMueble> componentes = new ArrayList<>();


    /**
     * Instantiates a new Mueble.
     *
     * @param nombre   the nombre
     * @param alto     the alto
     * @param ancho    the ancho
     * @param fondo    the fondo
     * @param peso     the peso
     * @param material the material
     */
    protected Mueble(String nombre, int alto, int ancho, int fondo, int peso, String material) {
        super(nombre, alto, ancho, fondo, peso, material);
    }

    /**
     * Instantiates a new Mueble.
     *
     * @param nombre     the nombre
     * @param alto       the alto
     * @param ancho      the ancho
     * @param fondo      the fondo
     * @param peso       the peso
     * @param material   the material
     * @param habitacion the habitacion
     */
    protected Mueble(String nombre, int alto, int ancho, int fondo, int peso, String material, String habitacion) {
        super(nombre, alto, ancho, fondo, peso, material);
        this.habitacion = habitacion;
    }

    /**
     * Gets componentes.
     *
     * @return the componentes
     */
    public List<ComponenteDeMueble> getComponentes() {
        return componentes;
    }

    /**
     * Sets componentes.
     *
     * @param componentes the componentes
     */
    public void setComponentes(List<ComponenteDeMueble> componentes) {
        this.componentes = componentes;
    }
    /**
     * El método showInfo muestra en pantalla la información básica de un mueble.
     */
    @Override
    public void showInfo() {
        System.out.println("FICHA DE MUEBLE");
        super.showInfo();
        System.out.println("Numero de componentes: " + componentes.size());
        System.out.println("Listado de Componentes: ");
        componentes.forEach(n ->  {
            ObjetoFisico o =  n;
            o.showInfo();
        });
    }

    /**
     * Gets habitacion.
     *
     * @return the habitacion
     */
    public String getHabitacion() {
        return habitacion;
    }

    /**
     * Sets habitacion.
     *
     * @param habitacion the habitacion
     */
    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }
}
