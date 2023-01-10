package com.example.loginproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginApplication extends Application {
  private static Stage stg;

  @Override
  public void start(Stage stage) throws IOException {
    stg = stage;
    stage.setResizable(false);
    FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("login-page.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 600, 400);
    stage.setTitle("Login Page");
    stage.setScene(scene);
    stage.show();
  }

  public void changeScene(String fxml) throws IOException{
    Parent pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
    stg.getScene().setRoot(pane);
  }

  public static void main(String[] args) {
    launch();
  }
}