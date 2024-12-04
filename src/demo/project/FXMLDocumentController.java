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

/**
 *
 * @author tosha
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button loginButtton;
    @FXML
    private Button signUpButton;
    @FXML
    private Label userIDLebel;
    @FXML
    private Label donthaveLebel;
    @FXML
    private Label passwordLebel;
    @FXML
    private TextField userIdTextField;
    @FXML
    private TextField passwordTextField;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginButtonHandeler(ActionEvent event) throws Exception
    {
         Utility.changeToScene (getClass(), event, "homeMenuScene.fxml");
    }

    @FXML
    private void signUpButtonHandeler(ActionEvent event) throws Exception
    {
         Utility.changeToScene (getClass(), event, "createAccountScene.fxml");
    }
    
}
