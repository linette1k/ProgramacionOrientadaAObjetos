package mx.com.cuh;

public class Panadero extends Persona{
    public Panadero(String nombre, short altura, short edad, double sueldo) {
        super(nombre, altura, edad, sueldo);
        nombre = "Diego Gomez";
    }
    boolean trabajando = false;

    @Override
    public String trabajar(){
        trabajando = !trabajando;
        String trabajo = "Horneando";

        return trabajo;
    }
    @Override
    public void cobrar(){
        System.out.println("Cobrar sueldo del panadero");
    }
    @Override
    public void alimentarse(){
        System.out.println("Hora de comer para el panadero");

    }
    @Override
    public void checar(){
        if(!trabajando)
            System.out.println("Ingreso registrado");
        else
            System.out.println("Salida registrada");
    }

}