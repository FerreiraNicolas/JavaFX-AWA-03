/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awa.pkg03;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author etudiant
 */
public class AWA03 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TextField msg = new TextField();
        Label maj = new Label();
        Button btn = new Button();
        btn.setText("Majuscule");
        VBox root = new VBox();
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String message = msg.getCharacters().toString();
                maj.setText(message.toUpperCase());
       
            }
        });
        

        root.getChildren().add(msg);
        root.getChildren().add(maj);
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("AWA-03");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
