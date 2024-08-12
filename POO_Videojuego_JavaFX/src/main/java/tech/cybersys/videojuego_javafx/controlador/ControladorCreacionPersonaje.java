package tech.cybersys.videojuego_javafx.controlador;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import tech.cybersys.videojuego_javafx.modelo.Personaje;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAO;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAOImpl;

public class ControladorCreacionPersonaje {
    @FXML
    private TabPane TablaPestanas;
    @FXML
    private TextArea CampoHistoria;
    @FXML
    private TextField CampoNombre;
    @FXML
    private Label EtiquetaErrorNombre;
    @FXML
    private TextField CampoSalud;
    @FXML
    private TextField CampoFuerza;
    @FXML
    private TextField CampoInteligencia;
    @FXML
    private TextField CampoDinero;
    @FXML
    private Button BotonCrearPersonaje;
    Personaje PersonajeGuardado;

    public ControladorCreacionPersonaje() {
    }

    @FXML
    public void MostrarAtributosComerciante() throws IOException {
        String historia = "Un astuto comerciante, nacido en el bullicioso puerto de Marvella. Desde joven, aprendió el arte del trueque y la negociación de su padre, un renombrado mercader. Con un ojo agudo para los tesoros y una lengua de plata, él viaja por tierras lejanas en busca de objetos raros y valiosos. Su tienda es conocida por tener los artículos más exóticos y útiles, desde pociones mágicas hasta armas legendarias. Aunque su apariencia es modesta, su conocimiento y recursos son invaluables para cualquier aventurero que cruce su camino.";
        if (this.CampoNombre.getText().equals("")) {
            this.EtiquetaErrorNombre.setVisible(true);
        } else {
            this.EtiquetaErrorNombre.setVisible(false);
            this.TablaPestanas.setVisible(true);
            Personaje comerciante = (new Personaje.Builder()).setClase("Comerciante").setFuerza("50").setHistoria(historia).setInteligencia("55").setSalud("200").setNombre("Carlos").setDinero("1000").build();
            this.PersonajeGuardado = comerciante;
            this.CampoHistoria.setText(comerciante.getHistoria());
            this.CampoSalud.setText(comerciante.getSalud());
            this.CampoFuerza.setText(comerciante.getFuerza());
            this.CampoDinero.setText(comerciante.getDinero());
            this.CampoInteligencia.setText(comerciante.getInteligencia());
            this.CampoDinero.setText(comerciante.getDinero());
        }

    }

    @FXML
    public void MostrarAtributosSoldado() throws IOException {
        String historia = "Un soldado valiente, nacido en una pequeña aldea cercana a la frontera. Desde temprana edad, fue entrenado en el uso de armas y tácticas militares por su padre, un veterano de guerra. Con una voluntad de hierro y un sentido del deber inquebrantable, ha luchado en numerosas batallas defendiendo su patria. Su habilidad con la espada es legendaria, y su lealtad a sus compañeros lo convierte en un aliado valioso en cualquier conflicto.";
        if (this.CampoNombre.getText().equals("")) {
            this.EtiquetaErrorNombre.setVisible(true);
        } else {
            this.EtiquetaErrorNombre.setVisible(false);
            this.TablaPestanas.setVisible(true);
            Personaje soldado = (new Personaje.Builder()).setClase("Soldado").setFuerza("90").setHistoria(historia).setInteligencia("70").setSalud("100").setNombre("Hector").setDinero("500").build();
            this.PersonajeGuardado = soldado;
            this.CampoHistoria.setText(soldado.getHistoria());
            this.CampoSalud.setText(soldado.getSalud());
            this.CampoFuerza.setText(soldado.getFuerza());
            this.CampoDinero.setText(soldado.getDinero());
            this.CampoInteligencia.setText(soldado.getInteligencia());
            this.CampoDinero.setText(soldado.getDinero());
        }

    }

    @FXML
    public void MostrarAtributosAgricultor() throws IOException {
        String historia = "Un agricultor trabajador, nacido y criado en los vastos campos de Verdal. Desde joven, aprendió el arte de la agricultura y la cría de ganado de su familia, cuyos conocimientos sobre la tierra han pasado de generación en generación. Con manos callosas y una profunda conexión con la naturaleza, cultiva la tierra para producir alimentos que sostienen a su comunidad. Aunque su vida es sencilla, su dedicación y sabiduría lo convierten en un pilar esencial de su pueblo.";
        if (this.CampoNombre.getText().equals("")) {
            this.EtiquetaErrorNombre.setVisible(true);
        } else {
            this.EtiquetaErrorNombre.setVisible(false);
            this.TablaPestanas.setVisible(true);
            Personaje agricultor = (new Personaje.Builder()).setClase("Agricultor").setFuerza("70").setHistoria(historia).setInteligencia("60").setSalud("90").setNombre("Luis").setDinero("300").build();
            this.PersonajeGuardado = agricultor;
            this.CampoHistoria.setText(agricultor.getHistoria());
            this.CampoSalud.setText(agricultor.getSalud());
            this.CampoFuerza.setText(agricultor.getFuerza());
            this.CampoDinero.setText(agricultor.getDinero());
            this.CampoInteligencia.setText(agricultor.getInteligencia());
            this.CampoDinero.setText(agricultor.getDinero());
        }

    }

    @FXML
    public void CrearPersonaje(ActionEvent event) throws IOException {
        PersonajeDAO personajeDAO = new PersonajeDAOImpl();
        personajeDAO.guardarPersonaje(this.PersonajeGuardado);
        ControladorVentanas.mostrarVentana(event, (Stage)null, "Juego-view.fxml", "Pantalla de Juego");
    }

    @FXML
    public void CargarPersonaje(String nombre) throws IOException {
        PersonajeDAO personajedao = new PersonajeDAOImpl();
        personajedao.cargarPersonaje(nombre);
    }
}