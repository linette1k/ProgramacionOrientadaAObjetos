package tech.cybersys.videojuego_javafx.modelo.Builder;


import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class AgricultorBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public AgricultorBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
    	String historia = "Un agricultor trabajador, nacido y criado en los vastos campos de Verdal. " +
                "Desde joven, aprendió el arte de la agricultura y la cría de ganado de su familia, " +
                "cuyos conocimientos sobre la tierra han pasado de generación en generación. " +
                "Con manos callosas y una profunda conexión con la naturaleza, cultiva la tierra para " +
                "producir alimentos que sostienen a su comunidad. Aunque su vida es sencilla, su " +
                "dedicación y sabiduría lo convierten en un pilar esencial de su pueblo.";

        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("150");
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("100");
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("50");
    }

    @Override
    public void buildClase() {
        builder.setClase("Agricultor");
    }
    
    @Override
    public void buildDinero() {
    	builder.setDinero("100");
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}
