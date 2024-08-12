

package tech.cybersys.videojuego_javafx.controlador;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ControladorMenu {
    public ControladorMenu() {
    }

    @FXML
    public void BotonInicio(ActionEvent event) throws IOException {
        ControladorVentanas.mostrarVentana(event, (Stage)null, "CrearPersonaje-view.fxml", "Creacion de Personaje");
    }

    @FXML
    protected void onPantallaPersonajeClick(ActionEvent event) throws IOException {
    }
}