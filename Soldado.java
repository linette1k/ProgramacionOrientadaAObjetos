package mx.com.cuh;

public class Soldado extends Persona{
    public Soldado(String nombre, short altura, short edad, double sueldo) {
        super(nombre, altura, edad, sueldo);
        nombre = "Enrique Juarez";
    }
    boolean trabajando = false;

    @Override
    public String trabajar(){
        trabajando = !trabajando;
        String trabajo = "Ejercitandose";

        return trabajo;
    }
    @Override
    public void cobrar(){
        System.out.println("Cobrar sueldo del soldado");
    }
    @Override
    public void alimentarse(){
        System.out.println("Hora de comer para el soldado");

    }
    @Override
    public void checar(){
        if(!trabajando)
            System.out.println("Ingreso registrado");
        else
            System.out.println("Salida registrada");
    }

}