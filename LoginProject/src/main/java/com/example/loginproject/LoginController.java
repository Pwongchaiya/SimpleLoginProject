package com.example.loginproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

  public LoginController(){
  }

  @FXML
  private Button button;
  @FXML
  private TextField username;
  @FXML
  private PasswordField password;

  public void userLogin(ActionEvent event)throws IOException{
    checkLogin();
  }

  private void checkLogin() throws IOException{
    LoginApplication loginApplication = new LoginApplication();
    if (username.getText().equalsIgnoreCase("username") && password.getText().equalsIgnoreCase("123")) {
      loginApplication.changeScene("successfulLogin.fxml");
    }
  }

}
