
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;

import java.awt.*;
import java.io.IOException;

public class Controller {
    private Tournament tournament;

    @FXML
    private CheckBox cbGroupStage;

    @FXML
    private CheckBox cbPlayoffs;

    public void saveConfig(ActionEvent event) {
       // tournament.saveConfig();
    }

    public void amountOfTeams() {
        //ournament.amountOfTeams();
    }

    public void groupStage() {

    }

    public void playoffs() {

    }

    @FXML
    public void setConfigGUI(ActionEvent event) throws IOException {
        Parent playerGUI = FXMLLoader.load(getClass().getResource("TournamentConfig.fxml"));
        Scene playerScene = new Scene(playerGUI);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(playerScene);
        window.show();
    }

    @FXML
    public void setPlayerGUI(ActionEvent event) throws IOException {
        Parent playerGUI = FXMLLoader.load(getClass().getResource("AddPlayersGui.fxml"));
        Scene playerScene = new Scene(playerGUI);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(playerScene);
        window.show();
    }

    @FXML
    public void setTeamsGUI(ActionEvent event) throws IOException {
        Parent playerGUI = FXMLLoader.load(getClass().getResource("ListGUI.fxml"));
        Scene playerScene = new Scene(playerGUI);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(playerScene);
        window.show();
    }

    @FXML
    public void setOverViewGUI(ActionEvent event) throws IOException {
        Parent playerGUI = FXMLLoader.load(getClass().getResource("joelsGui.fxml"));
        Scene playerScene = new Scene(playerGUI);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(playerScene);
        window.show();
    }

    @FXML
    public void handleGroupStageBox(ActionEvent actionEvent){
        if(cbGroupStage.isSelected()) {

        } else {

        }
    }

    @FXML
    public void handlePlayoffsBox(ActionEvent actionEvent){

    }
}
