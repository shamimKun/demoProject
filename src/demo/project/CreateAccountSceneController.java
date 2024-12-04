/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tosha
 */
public class CreateAccountSceneController implements Initializable {

    @FXML
    private Label nameLebal;
    @FXML
    private TextField nameTextField;
    @FXML
    private Label labelHeight;
    @FXML
    private TextField heightTextField;
    @FXML
    private Label labelWeight;
    @FXML
    private TextField weightTextField;
    @FXML
    private Label dob;
    @FXML
    private DatePicker datePicker;
    @FXML
    private Button createButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void nameTextFieldHandeler(ActionEvent event) {
    }

    @FXML
    private void heightTextFieldHandeler(ActionEvent event) {
    }

    @FXML
    private void weightTextFieldHandeler(ActionEvent event) {
    }

    @FXML
    private void datePickerHandeler(ActionEvent event) {
    }

    @FXML
    private void createButtonHandeler(ActionEvent event) throws Exception
    {
       // Utility.changeToScene (getClass(), event, "homeMenuScene.fxml");
       Utility.changeToScene (getClass(), event, "MainMenu.fxml");
    }
    
}
