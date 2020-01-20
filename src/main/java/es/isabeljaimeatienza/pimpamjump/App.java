package es.isabeljaimeatienza.pimpamjump;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    
    short ballCenterX = 80; //poner variables globales debajo del class
    byte ballCurrentSpeedX = 10; //esto hará que cambiemos la posición cuando queramos, es decir, le damos la velocidad, lo que le vamos sumando o restando
                                  // dependiendo si quiero que vaya hacia atrás para que vaya a la izquierda o sumando y que vaya a la derecha
     byte ballDirectionX = 1; //multiplicas velocidad por dirección
      
     short ballCenterY = 80; //poner variables globales debajo del class
     byte ballCurrentSpeedY = 2; //esto hará que cambiemos la posición cuando queramos, es decir, le damos la velocidad, lo que le vamos sumando o restando
                                  // dependiendo si quiero que vaya hacia atrás para que vaya a la izquierda o sumando y que vaya a la derecha
     byte ballDirectionY = 1;
   
    
    final short SCENE_HEIGHT =780 ; //poniendo final hacemos una constante-- mayúsculas para que directamente sepamos que son constantes
    final short SCENE_WIDTH = 1080;
 
    
    
    @Override
    public void start(Stage stage) {
        Pane root = new Pane(); //lo guardo en una variable que he llamado root (el panel)
        var scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);//Crea ventana de esa medida usando la variable root
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        
        Image image1 = new Image(getClass().getResourceAsStream("/resources/fondo.png"));
        ImageView imageView1 = new ImageView(image1);
        
        imageView1.setX(0);
        imageView1.setY(0);  
        
        root.getChildren().add(imageView1);

           //new Circle--> crear un objeto de la clase Circle
        Circle circleBall = new Circle(); //aquí voy a guardar una bola, con new me creo objeto circulo
        //llamando a métodos del objeto circleBall
        circleBall.setCenterX(30); // obligatoriamente debe de tener una medida, double permite decimales
        circleBall.setCenterY(30);
        circleBall.setRadius(20);//son métodos: nosequé. lo que sea
        circleBall.setFill(Color.GREEN);//Cambiar el color de la bola
        
        
        double r= circleBall.getRadius()*2; //me retorna un número
        
       //Circle circleBall2= new Circle(10, 30, 7); es otro modo de hacer la bola pero con menos líneas
        
        root.getChildren().add(circleBall);//los hijos hace referencia a las cosas que contiene el panel
        
    }

    public static void main(String[] args) {
        launch();
    }

}