package mx.com.cuh;

public class Constructor extends Persona{
    public Constructor(String nombre, short altura, short edad, double sueldo) {
        super(nombre, altura, edad, sueldo);
        nombre="Luis Perez";
    }
    boolean trabajando = false;

    @Override
    public String trabajar(){
        trabajando = !trabajando;
        String trabajo = "Construyendo";
        return trabajo;
    }
    @Override
    public void cobrar(){
        System.out.println("Cobrar sueldo de constructor");
    }
    @Override
    public void alimentarse(){
        System.out.println("Hora de comer para constructor");
    }
    @Override
    public void checar(){
        if(!trabajando)
            System.out.println("Ingreso registrado");
        else
            System.out.println("Salida registrada");
    }
}