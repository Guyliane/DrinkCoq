package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController {

    //region VARIABLES
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton validerButton;

    @FXML
    private JFXTextField usernameTf;

    @FXML
    private JFXPasswordField passwordTf;

    @FXML
    private JFXButton signUpButton;
    //endregion

    @FXML
    void initialize() {
        validerButton.setOnAction(event -> {
            System.out.println("Connexion Valide!");
        });
    }
}
