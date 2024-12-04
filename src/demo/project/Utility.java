
package demo.project;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author MichaelO
 */
public class Utility 
{
    // Example use:
    //  Utility.changeToScene (getClass(), event, "myXLM.fxml");
    public static void changeToScene(Class aClass, Event aEvent, String sceneFileStr) throws Exception
    {
        Parent root = FXMLLoader.load (aClass.getResource(sceneFileStr));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) aEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();  
    }
    
     //  Utility.changeToPopUpScene (getClass(), event, "myXLM.fxml");
    public static void changeToPopUPScene(Class aClass, Event aEvent, String sceneFileStr) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(aClass.getResource(sceneFileStr));
            Parent root = loader.load();

            // Create a new Stage for the popup
            Stage popupStage = new Stage();
            popupStage.initModality(Modality.APPLICATION_MODAL); // Block main window
           // popupStage.setTitle("Enter Age");
            popupStage.setScene(new Scene(root));
            popupStage.showAndWait(); // Wait for the popup to close
        
    }
    
    
    //Utility.changeCentreScene(borderPane,getClass(), event, "myXLM.fxml");
    public static void changeCentreScene(BorderPane  bordarpane,Class aClass, Event aEvent, String sceneFileStr) throws Exception{
         FXMLLoader loader = new FXMLLoader(aClass.getResource(sceneFileStr));
            Node newContent = loader.load();
            bordarpane.setCenter(newContent);
    }
}