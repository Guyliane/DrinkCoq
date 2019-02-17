package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

public class SignupController {


    //region VARIABLES
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField inscriptionPrenom;

    @FXML
    private JFXTextField inscriptionNom;

    @FXML
    private JFXTextField inscriptionUtilisateur;

    @FXML
    private JFXCheckBox inscriptionCheckHomme;

    @FXML
    private JFXCheckBox inscriptionCheckFemme;

    @FXML
    private JFXPasswordField inscriptionMotDePasse;

    //@FXML
    //private ChoiceBox<?> inscriptionLocation;

    @FXML
    private JFXButton inscriptionValiderBouton;
    //endregion

    @FXML
    void initialize() {


    }
}
