/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author tosha
 */
public class MainMenuController implements Initializable {

    @FXML
    private MenuBar menuBar;
    @FXML
    private Menu homeMenu;
    @FXML
    private Menu activitiesMenu;
    @FXML
    private MenuItem walkingActivityMenu;
    @FXML
    private MenuItem runningActivityMenu;
    @FXML
    private MenuItem swimmingActivityMenu;
    @FXML
    private MenuItem lightExcerciseMenuHandler;
    @FXML
    private Menu foodMEnu;
    @FXML
    private Menu profileMenu;
    @FXML
    private Menu healthIndexMenu;
    @FXML
    private MenuItem bmiMenu;
    @FXML
    private MenuItem bmrMenu;
    @FXML
    private MenuItem bodyFatMenu;
    @FXML
    private MenuItem idealWeightMenu;
    @FXML
    private Menu helthRecordMenu;
    @FXML
    private MenuItem addSugermenu;
    @FXML
    private MenuItem addBloodPressureMenu;
    @FXML
    private MenuItem showSugerRecordMenu;
    @FXML
    private MenuItem showBloodPressureRecordMenu;
    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private MenuItem returnHome;
    @FXML
    private MenuItem foodintake;
    @FXML
    private MenuItem addNewFood;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         returnHome.fire();
    }    

    @FXML
    private void homeMenuHandler(ActionEvent event) throws Exception{
         
    }

    @FXML
    private void walkingHandler(ActionEvent event) throws Exception 
    {
         Utility.changeToPopUPScene(getClass(),event,"walkingInputScene.fxml");
    }

    @FXML
    private void activitiesMenuHandler(Event event) {
    }

    @FXML
    private void runningHandler(ActionEvent event) {
    }

    @FXML
    private void swimmingHandler(ActionEvent event) {
    }

    @FXML
    private void lightExerciseHandler(ActionEvent event) {
    }


    @FXML
    private void foodMenuHandler(ActionEvent event) {
    }

    @FXML
    private void bmiMenuHandler(ActionEvent event) throws Exception
    {
         Utility.changeToPopUPScene(getClass(),event,"bmiScene.fxml");
    }

    @FXML
    private void healthIndexMenuHandler(Event event) {
    }

    @FXML
    private void bmrMenuHandler(ActionEvent event) throws Exception
    {
         Utility.changeToPopUPScene(getClass(),event,"bmrScene.fxml");
    }

    @FXML
    private void bodyFatHandler(ActionEvent event) throws Exception
    {
         Utility.changeToPopUPScene(getClass(),event,"bodyFatScene.fxml");
    }

    @FXML
    private void idealWeightMenuHandler(ActionEvent event) throws Exception
    {
        Utility.changeToPopUPScene(getClass(),event,"idealWeightScene.fxml");
    }


    @FXML
    private void profileMenuHandler(ActionEvent event) {
    }

    @FXML
    private void addSugerHandler(ActionEvent event) throws Exception
    {
        Utility.changeToPopUPScene(getClass(),event,"addSugerScene.fxml");
    }

    @FXML
    private void healthRecordHandler(Event event) {
    }

    @FXML
    private void addBloodPresureHandler(ActionEvent event) throws Exception
    {
        Utility.changeToPopUPScene(getClass(),event,"addBloodpressureScene.fxml");;
    }

    @FXML
    private void showSugerRecordHandler(ActionEvent event) throws Exception
    {
        Utility.changeToPopUPScene(getClass(),event,"showSugerRecordScene.fxml");
    }

    @FXML
    private void showBloodPressureRecordHandler(ActionEvent event) throws Exception {
        Utility.changeToPopUPScene(getClass(),event,"showBloodPressureRecordScene.fxml");
    }

    @FXML
    private void homeMenuHandler(Event event) {
    }

    @FXML
    private void returnHomeMenuHandler(ActionEvent event) throws Exception {
        Utility.changeCentreScene(mainBorderPane,getClass(), event, "homeMenuScene.fxml");
    }

    @FXML
    private void foodIntakeHandler(ActionEvent event) {
    }

    @FXML
    private void foodMenuHandler(Event event) throws Exception
    {
        Utility.changeCentreScene(mainBorderPane,getClass(), event, "foodMenuScene.fxml");
    }

    @FXML
    private void addnewFoodHandler(ActionEvent event) throws Exception
    {
        Utility.changeCentreScene(mainBorderPane,getClass(), event, "addNewFoodScene.fxml");
    }

    
}
