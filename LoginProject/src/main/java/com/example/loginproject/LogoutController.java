package com.example.loginproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class LogoutController {
  @FXML
  private Button logout;

  public void logout(ActionEvent event) throws IOException{
    LoginApplication main = new LoginApplication();
    main.changeScene("login-page.fxml");
  }

}
