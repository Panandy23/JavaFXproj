package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.model.User;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

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

    }

    @FXML
    public void login() {
        if(!loginTextFild.getText().trim().isEmpty() && !loginPasswordField.getText().trim().isEmpty()){
            boolean isLogin = loginTextFild.getText().equalsIgnoreCase(User.getExampleUser().getLogin());
            boolean isPassword = loginPasswordField.getText().equalsIgnoreCase(User.getExampleUser().getPassword());

            if(isLogin && isPassword){
            statusLabel.setText("login correct");

            }else{
            statusLabel.setText("invalid credentials");
            }

            } else {
            statusLabel.setText("one of two field is/are empty");


        }
    }

}

