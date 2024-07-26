package mx.com.cuh;

public class Comerciante extends Persona{
    public Comerciante(String nombre, short altura, short edad, double sueldo) {
        super(nombre, altura, edad, sueldo);
        nombre = "Luis Fernandez";
    }
    boolean trabajando = false;

    @Override
    public String trabajar(){
        trabajando = !trabajando;
        String trabajo = "Comerciando";

        return trabajo;
    }
    @Override
    public void cobrar(){
        System.out.println("Cobrar sueldo de comerciante");
    }
    @Override
    public void alimentarse(){
        System.out.println("Hora de comer para comerciante");

    }
    @Override
    public void checar(){
        if(!trabajando)
            System.out.println("Ingreso registrado");
        else
            System.out.println("Salida registrada");
    }

}