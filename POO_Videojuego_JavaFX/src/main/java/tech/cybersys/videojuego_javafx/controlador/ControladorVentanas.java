package tech.cybersys.videojuego_javafx.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ControladorVentanas {


        public void cambiarVentana_CrearPersonaje(ActionEvent evento) throws IOException{
            Parent VentanaPadre = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
            Stage pantalla = (Stage) ((Node) evento.getSource()).getScene().getWindow();
            Scene ventana = new Scene(VentanaPadre);
                pantalla.setScene(ventana);
                pantalla.show();
        }

        public void cambiarVentana_CargarPartida(ActionEvent evento) throws IOException{
                Parent VentanaPadre = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
                Stage pantalla = (Stage) ((Node) evento.getSource()).getScene().getWindow();
                Scene ventana = new Scene(VentanaPadre);
                pantalla.setScene(ventana);
                pantalla.show();
        }



}
