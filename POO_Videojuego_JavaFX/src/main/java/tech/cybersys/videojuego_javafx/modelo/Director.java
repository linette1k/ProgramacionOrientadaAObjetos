package tech.cybersys.videojuego_javafx.modelo;

import tech.cybersys.videojuego_javafx.modelo.Builder.ComercianteBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.PersonajeBuilder;

public class Director {
    
	private PersonajeBuilder builder;

    public void setBuilder(PersonajeBuilder builder) {
        this.builder = builder;
    }

    public Personaje construirPersonaje(String nombre) {
        builder.buildNombre(nombre);
        builder.buildSalud();
        builder.buildFuerza();
        builder.buildInteligencia();
        builder.buildClase();
        builder.buildDinero();
        builder.buildHistoria();
        return builder.getPersonaje();
    }
}
