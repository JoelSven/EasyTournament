package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

import java.io.IOException;

public class PlayoffsController {
    private Controller controller;

    public PlayoffsController(Controller controller) {
        this.controller = controller;
    }

    @FXML
    public void setPlayoffsGUI(ActionEvent event, AmountOfTeams selectedItem) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        switch (selectedItem) {
            case Three:
                loader.setLocation(getClass().getResource("../view/FirstPage.fxml"));
                break;
        }
        Parent playerGUI = loader.load();
        Controller controller = loader.getController();
        Scene playerScene = new Scene(playerGUI);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(playerScene);
        window.show();
    }
}