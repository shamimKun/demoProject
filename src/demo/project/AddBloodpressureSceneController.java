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
public class AddBloodpressureSceneController implements Initializable {

    @FXML
    private DatePicker datePicker;
    @FXML
    private Button todatButton;
    @FXML
    private Button resetButton;
    @FXML
    private Label addLabel;
    @FXML
    private TextField inputSugerTextArea;
    @FXML
    private Button saveButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void datePickerHandler(ActionEvent event) {
    }

    @FXML
    private void todayButtonHandler(ActionEvent event) {
    }

    @FXML
    private void resetButtonHandler(ActionEvent event) {
    }

    @FXML
    private void inputSugerTextAreaHandler(ActionEvent event) {
    }

    @FXML
    private void saveButtonHandler(ActionEvent event) {
    }
    
}
