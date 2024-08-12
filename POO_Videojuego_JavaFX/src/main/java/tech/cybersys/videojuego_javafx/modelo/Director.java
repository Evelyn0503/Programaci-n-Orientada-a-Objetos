package tech.cybersys.videojuego_javafx.modelo;

import tech.cybersys.videojuego_javafx.modelo.Builder.ComercianteBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.PersonajeBuilder;

public class Director {
    private ComercianteBuilder builder;

    public void setBuilder(ComercianteBuilder builder) {
        this.builder = builder;
    }

    public Personaje construirComerciante(String nombre) {
        builder.buildNombre(nombre);
        builder.buildSalud();
        builder.buildFuerza();
        builder.buildInteligencia();
        builder.buildClase();
        return builder.getPersonaje();
    }
}
