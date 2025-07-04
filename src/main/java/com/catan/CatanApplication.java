package com.catan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Main application class for the CATAN board game.
 * This class handles the JavaFX application lifecycle and window management.
 */
public class CatanApplication extends Application {
    
    private static final String TITLE = "CATAN - Das Spiel";
    private static final int WINDOW_WIDTH = 1200;
    private static final int WINDOW_HEIGHT = 800;
    
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CatanApplication.class.getResource("/main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), WINDOW_WIDTH, WINDOW_HEIGHT);
        
        stage.setTitle(TITLE);
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setMinWidth(800);
        stage.setMinHeight(600);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
