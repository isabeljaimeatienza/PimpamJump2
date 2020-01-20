package es.isabeljaimeatienza.pimpamjump;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    
    final short SCENE_HEIGHT =780 ; //poniendo final hacemos una constante-- mayúsculas para que directamente sepamos que son constantes
    final short SCENE_WIDTH = 1080;
    @Override
    public void start(Stage stage) {
        Pane root = new Pane(); //lo guardo en una variable que he llamado root (el panel)
        var scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);//Crea ventana de esa medida usando la variable root
        scene.setFill(Color.BLACK);//cuidado con las mayúsculas
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}