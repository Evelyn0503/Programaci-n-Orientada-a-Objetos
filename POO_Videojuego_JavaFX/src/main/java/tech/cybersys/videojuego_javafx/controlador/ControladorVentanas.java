package tech.cybersys.videojuego_javafx.controlador;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControladorVentanas {
    private static String rutaVistas = "/tech/cybersys/videojuego_javafx/vista/";

    public ControladorVentanas() {
    }

    public String getRutaVistas() {
        return rutaVistas;
    }

    public void setRutaVista(String rutaVista) {
        rutaVistas = rutaVista;
    }

    public static void mostrarVentana(ActionEvent evt, Stage stage, String fxml, String titulo) throws IOException {
        fxml = rutaVistas + fxml;
        Parent root = (Parent)FXMLLoader.load(ControladorVentanas.class.getResource(fxml));
        Scene scene = new Scene(root);
        Stage window = null;
        String tituloVentana = "";
        if (evt != null) {
            window = (Stage)((Node)evt.getSource()).getScene().getWindow();
        } else if (stage != null) {
            window = stage;
        }

        assert window != null;

        window.setTitle(tituloVentana + " > " + titulo);
        window.setScene(scene);
        window.show();
    }
}