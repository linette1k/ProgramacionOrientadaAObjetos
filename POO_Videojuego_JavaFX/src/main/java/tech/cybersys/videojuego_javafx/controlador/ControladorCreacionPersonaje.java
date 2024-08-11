package tech.cybersys.videojuego_javafx.controlador;

import static tech.cybersys.videojuego_javafx.controlador.ControladorVentanas.mostrarVentana;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import tech.cybersys.videojuego_javafx.modelo.Director;
import tech.cybersys.videojuego_javafx.modelo.Personaje;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAO;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAOImpl;
import tech.cybersys.videojuego_javafx.modelo.Builder.AgricultorBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.ComercianteBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.SoldadoBuilder;

public class ControladorCreacionPersonaje {

    @FXML private TabPane TablaPestanas;
    @FXML private TextArea CampoHistoria;
    @FXML private TextField CampoNombre;
    @FXML private Label EtiquetaErrorNombre;
    @FXML private TextField CampoSalud;
    @FXML private TextField CampoFuerza;
    @FXML private TextField CampoInteligencia;
    @FXML private TextField CampoDinero;
    @FXML private Button BotonCrearPersonaje;
    
    private Director director;

    private Personaje PersonajeGuardado;

    @FXML
    public void MostrarAtributosComerciante() throws IOException {
        if(CampoNombre.getText().equals("")){
            EtiquetaErrorNombre.setVisible(true);
        }else{
        	director = new Director();
        	
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            
            PersonajeGuardado = crearComerciante(CampoNombre.getText());

            this.asignarValores();
        }
    }
    
    @FXML
    public void MostrarAtributosAgricultor() throws IOException {
        if(CampoNombre.getText().equals("")){
            EtiquetaErrorNombre.setVisible(true);
        }else{
        	director = new Director();
        	
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            
            PersonajeGuardado = crearAgricultor(CampoNombre.getText());

            this.asignarValores();
        }
    }
    
    @FXML
    public void MostrarAtributosSoldado() throws IOException {
    	
        if(CampoNombre.getText().equals("")){
            EtiquetaErrorNombre.setVisible(true);
        }else{
        	director = new Director();
        	
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            
            PersonajeGuardado = crearSoldado(CampoNombre.getText());
            this.asignarValores();
        }
    }

    @FXML
   public void CrearPersonaje(ActionEvent event) throws IOException {
       PersonajeDAO personajeDAO = new PersonajeDAOImpl();
       personajeDAO.guardarPersonaje(PersonajeGuardado);
        mostrarVentana(event, null, "Juego-view.fxml", "Pantalla de Juego");
   }

   @FXML
    public void CargarPersonaje(String nombre) throws IOException {
        Personaje personaje1;
        PersonajeDAO personajedao = new PersonajeDAOImpl();
        personaje1 = personajedao.cargarPersonaje(nombre);
   }
   
   private Personaje crearComerciante(String nombre) {
       ComercianteBuilder comercianteBuilder = new ComercianteBuilder();
       director.setBuilder(comercianteBuilder);
       return director.construirPersonaje(nombre);
   }

   private Personaje crearAgricultor(String nombre) {
        AgricultorBuilder agricultorBuilder = new AgricultorBuilder();
        director.setBuilder(agricultorBuilder);
        return director.construirPersonaje(nombre);
    }

    private Personaje crearSoldado(String nombre) {
        SoldadoBuilder soldadoBuilder = new SoldadoBuilder();
        director.setBuilder(soldadoBuilder);
        return director.construirPersonaje(nombre);
    }
    
    private void asignarValores() {
    	CampoHistoria.setText(PersonajeGuardado.getHistoria());
        CampoSalud.setText(PersonajeGuardado.getSalud());
        CampoFuerza.setText(PersonajeGuardado.getFuerza());
        CampoDinero.setText(PersonajeGuardado.getDinero());
        CampoInteligencia.setText(PersonajeGuardado.getInteligencia());
        CampoDinero.setText(PersonajeGuardado.getDinero());
    }
}
