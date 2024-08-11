package tech.cybersys.videojuego_javafx.modelo.Builder;


import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class SoldadoBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public SoldadoBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
    	String historia = "Un soldado valiente, nacido en una pequeña aldea cercana a la frontera. " +
                "Desde temprana edad, fue entrenado en el uso de armas y tácticas militares por su padre, " +
                "un veterano de guerra. Con una voluntad de hierro y un sentido del deber inquebrantable, " +
                "ha luchado en numerosas batallas defendiendo su patria. Su habilidad con la espada es legendaria, " +
                "y su lealtad a sus compañeros lo convierte en un aliado valioso en cualquier conflicto.";
    	
        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("200");
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("500");
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("300");
    }

    @Override
    public void buildClase() {
        builder.setClase("Soldado");
    }
    
    @Override
    public void buildDinero() {
    	builder.setDinero("800");
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}
