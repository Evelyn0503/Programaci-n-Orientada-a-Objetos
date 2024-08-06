package tech.cybersys.videojuego_javafx.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class ControladorMenu {
    @FXML
    private Label Label_Mensaje_Bienvenida;



    @FXML
    protected void onHelloButtonClick() {
        Label_Mensaje_Bienvenida.setText("¡Inicia el Juego!");
        Label_Mensaje_Bienvenida.setVisible(true);
    }

    @FXML
    protected void onPantallaPersonajeClick() throws IOException {
      //Cambios agregados al código desde un ambiente remoto
    }

}
