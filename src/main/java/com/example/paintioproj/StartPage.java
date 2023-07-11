package com.example.paintioproj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class StartPage extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartPage.class.getResource("StartPage.fxml"));
        Image icon = new Image("F:\\paint-io-proj\\src\\icon.png");
        Scene scene = new Scene(fxmlLoader.load(), 650, 650);
        stage.setTitle("Paint.IO");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}