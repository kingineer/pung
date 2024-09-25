package com.kingineer.github;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        URL path = App.class.getResource("view/gameplay.fxml");
        Scene root = FXMLLoader.load(path);
        stage.setScene(root);
        stage.setTitle("Pong");
        stage.setMaximized(true);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
