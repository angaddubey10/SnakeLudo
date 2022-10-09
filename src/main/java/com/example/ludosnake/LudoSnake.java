package com.example.ludosnake;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LudoSnake extends Application {

    Group tileGroup = new Group();

    int yLine = 360;
    int xLine = 40;
    public Pane createContent(){
        Pane root = new Pane();
        root.setPrefSize(400,400);
        root.getChildren().addAll(tileGroup);

        Button player1Button = new Button("Player One");
        player1Button.setTranslateX(10);
        player1Button.setTranslateY(yLine);

        Button player2Button = new Button("Player Tow");
        player2Button.setTranslateX(300);
        player2Button.setTranslateY(yLine);

        Button gameButton = new Button("Start Game");
        gameButton.setTranslateX(150);
        gameButton.setTranslateY(yLine);




        tileGroup.getChildren().addAll(player1Button,player2Button,gameButton);

        return root;
    }

    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(LuodSnake.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(createContent());
        stage.setTitle("Ludo Snake");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}