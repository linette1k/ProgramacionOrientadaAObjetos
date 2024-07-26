package mx.com.cuh;
public class Main {

    public static void main(String[] args) {
        String nombre = "";
       
        Persona persona1 = new Persona("Julio", (short)182,(short) 23, 0);
        Persona comerciante = new Comerciante("Luis Fernandez", (short) 170, (short) 20, 190);
        Persona constructor = new Constructor("Luis Perez", (short) 160, (short) 29, 200);
        Persona jardinero = new Jardinero("Marco Perez", (short) 184, (short) 25, 250);
        Persona Panadero = new Panadero("Diego Gomez", (short) 178, (short) 23, 100);
        Persona Soldado = new Soldado("Enrique Juarez", (short) 152, (short) 18, 20);
     
     
     System.out.println("trabajadores");
     persona1.mostrarNombre();
     comerciante.mostrarNombre();
     constructor.mostrarNombre();
     jardinero.mostrarNombre();
     Panadero.mostrarNombre();
     Soldado.mostrarNombre();
 
       
        persona1.checar();
        comerciante.checar();
        constructor.checar();
        jardinero.checar();
        Panadero.checar();
        Soldado.checar();
    
        
        persona1.trabajar();
        comerciante.trabajar();
        constructor.trabajar();
        jardinero.trabajar();
        Panadero.trabajar();
        Soldado.trabajar();

        
        persona1.alimentarse();
        comerciante.alimentarse();
        constructor.alimentarse();
        jardinero.alimentarse();
        Panadero.alimentarse();
        Soldado.alimentarse();


        
        persona1.cobrar();
        comerciante.cobrar();
        constructor.cobrar();
        jardinero.cobrar();
        Panadero.cobrar();
        Soldado.cobrar();
        
         
        persona1.checar();
        comerciante.checar();
        constructor.checar();
        jardinero.checar();
        Panadero.checar();
        Soldado.checar();
        
        

    
    }
}