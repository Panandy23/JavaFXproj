package applicationJFX.controllers;

import applicationJFX.service.UserService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import applicationJFX.model.User;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    private UserService userService;

    @FXML
    private AnchorPane loginAnchorPane;

    @FXML
    private Button loginButton;

    @FXML
    private TextField loginTextFild;

    @FXML
    private PasswordField loginPasswordField;

    @FXML
    private Label statusLabel;

        @Override
    public void initialize(URL location, ResourceBundle resources) {
    userService = new UserService();
    }

    @FXML
    public void login() {
       String userName = loginTextFild.getText();
       String password = loginPasswordField.getText();
        if(!userName.trim().isEmpty() && !password.trim().isEmpty()){

            if(userService.isUserValid(userName, password)){
            statusLabel.setText("login correct");

            }else{
            statusLabel.setText("invalid credentials");
            }

            } else {
            statusLabel.setText("one of two field is/are empty");


        }
    }

}

