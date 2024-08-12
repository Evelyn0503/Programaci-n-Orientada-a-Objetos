package tech.cybersys.videojuego_javafx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JuegoMercado extends Application {
    public JuegoMercado() {
    }

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(JuegoMercado.class.getResource("vista/menu-view.fxml"));
        Scene MenuPrincipal = new Scene((Parent)fxmlLoader.load(), 800.0, 600.0);
        stage.setTitle("Juego_Mercado");
        stage.setScene(MenuPrincipal);
        stage.show();
    }

    public static void main(String[] args) {
        launch(new String[0]);
    }
}

