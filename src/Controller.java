
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Dialog;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    private Tournament tournament = new Tournament(this);

    private Config config;

    @FXML
    private CheckBox cbGroupStage;
    @FXML
    private CheckBox cbPlayoffs;
    @FXML
    private ComboBox<Config> cbConfig;
    @FXML
    private TextField tfAmountOfTeams;
    @FXML
    private TextField tfPlayerName;
    @FXML
    private ListView listAddedPlayers;
    @FXML
    private ListView listOverview;
    @FXML
    private ListView listTeamsPlayer;
    @FXML
    private Button btnRefresh;
    @FXML
    private Button btnPickTeams;

    private List save = new List();


    private ObservableList<Config> configStatusList = FXCollections.observableArrayList(Config.values());


    public Controller() {


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
        //handleAmountOfTeams();
        Parent playerGUI = FXMLLoader.load(getClass().getResource("AddPlayersGui.fxml"));
        Scene playerScene = new Scene(playerGUI);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(playerScene);
        window.show();
    }

    @FXML
    public void setTeamsGUI(ActionEvent event) throws IOException {
//        tournament.addPlayer(tournament.getPlayers());
        Parent playerGUI = FXMLLoader.load(getClass().getResource("ListGUI.fxml"));
        Scene playerScene = new Scene(playerGUI);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(playerScene);
        window.show();

    }

    @FXML
    public void setFirstPageGUI(ActionEvent event) throws IOException {
        Parent playerGUI = FXMLLoader.load(getClass().getResource("FirstPage.fxml"));
        Scene playerScene = new Scene(playerGUI);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(playerScene);
        window.show();
    }

    @FXML
    public void handleGroupStageBox(ActionEvent actionEvent) {
        tournament.groupStage();
    }


    @FXML
    public void handlePlayoffsBox(ActionEvent actionEvent) {
        tournament.playoffs();
    }

    @FXML
    public void handleConfig() {
        // tournament.playoffs();
    }


    /*public void initialize(){
        cbConfig.setValue(config);
        cbConfig.setItems(configStatusList);
    }

     */


    @FXML
    public void handleAmountOfTeams() {
        //tournament.setAmountOfTeams(tfAmountOfTeams.getText());
    }

    public void addPlayersToList() {
        String test = tfPlayerName.getText();
        if (test.isBlank()) {
            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
            alert1.setTitle("Name problems");
            alert1.setHeaderText(null);
            alert1.setContentText("The name can't be empty");
            alert1.showAndWait();
        } else if (Character.isDigit(test.charAt(0))) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Name problems");
            alert.setHeaderText(null);
            alert.setContentText("The name needs to start with a letter");
            alert.showAndWait();
        } else {
            listAddedPlayers.getItems().add(tfPlayerName.getText());
            tournament.addPlayer(tfPlayerName.getText());
        }
        tfPlayerName.setText("");
    }

    public void overviewRefresh() {
        listOverview.getItems().add("hej mamma");
    }

    //Uppdaterar listan i ListGUI
    public void update() {
        for (int i=0; i<tournament.getPlayersList().size(); i++)
            System.out.println(i);
            listTeamsPlayer.getItems().add(tournament.getPlayersList());

        }


//        for (int i = 0; i<temp.size(); i++) {
//            System.out.println(i);
//        }
//        for (Object p : temp) {
//            System.out.println(2);
//            System.out.println(p.toString() + " update");
//            List name = (List) p;
//            listTeamsPlayer.getItems().add(name);
//        }

//    public void teamsNext(ActionEvent event) throws IOException, InterruptedException {
//        setOverViewGUI(event);
//        Thread.sleep(2000);
//        overviewRefresh();
//    }

//    public void showGui(String showGui){
//        listOverview.getItems().add(showGui);
//    }

    }
