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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tosha
 */
public class WalkingInputSceneController implements Initializable {

    @FXML
    private TextField walkingInputTextField;
    @FXML
    private Button saveAndExistButton;
    @FXML
    private Label walkingLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void saveAndExistButtonHandler(ActionEvent event)
    {
        Stage stage = (Stage) saveAndExistButton.getScene().getWindow();
        stage.close();
    }
    
    public String getInput() {
        return walkingInputTextField.getText();
    }

    @FXML
    private void walkingInputTextFieldHandler(ActionEvent event)
    {
        
    }
    
}
