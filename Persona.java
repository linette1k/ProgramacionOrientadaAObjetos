package mx.com.cuh;

public class Persona implements Personal {
	   //Se inicializan los atributos de la clase
	   private String nombre = "";
	   private short altura = 0;
	   private short edad = 0;
	   private double sueldo = 0;
	   private boolean trabajando = false;


	   //Se define el constructor Persona con sus atributos principales al momento de instanciar
	   public Persona(String nombre, short altura, short edad, double sueldo){
	      this.nombre = nombre;
	      this.altura = altura;
	      this.edad = edad;
	      this.sueldo = sueldo;
	   }
	   /* Se definen los get y set
	   para la clase "Persona"
	    */
	   public String getNombre() {
	      nombre = "Sr." + nombre;
	      return nombre;
	   }
	   public void mostrarNombre(){
	      System.out.println(this.nombre);
	   }

	   public void setNombre(String nombre) {
	      this.nombre = nombre;
	   }


	   public String trabajar(){
	      trabajando = !trabajando;
	      String trabajo = "Trabajando";

	      return trabajo;
	   }
	   @Override
	   public void cobrar() {

	      System.out.println("Cobrando");

	   }
	   @Override
	   public void alimentarse() {
	      System.out.println("Hora de comida");
	   }
	   @Override
	   public void checar() {
	      if(!trabajando)
	         System.out.println("Ingreso registrado");
	      else
	         System.out.println("Salida registrada");
	   }


	}