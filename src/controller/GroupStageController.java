package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import model.*;
import java.io.IOException;

public class GroupStageController extends SceneControllerParent {

        @FXML
        private TableView<TeamStats> tblGroupStage;

        @FXML
        private TableColumn<TeamStats, String> colPosition;

        @FXML
        private TableColumn<TeamStats, String> colTeams;

        @FXML
        private TableColumn<TeamStats, String> colWins;

        @FXML
        private TableColumn<TeamStats, String> colLosses;

        @FXML
        private TableColumn<TeamStats, String> colDraws;

        @FXML
        private TableColumn<TeamStats, String> colPoints;



        @FXML
        public void setGroupStageGUI(ActionEvent event, AmountOfTeams selectedItem) throws IOException {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/GroupStage.fxml"));
            initTable();
            switch (selectedItem) {
                case Three:
                    initTable();
                    break;
                case Four:
                    initTable();
                    break;
                case Five:
                    initTable();
                    break;
                case Six:
                    break;
                case Seven:
                    break;
                case Eight:
                    break;
                case Nine:
                    break;
                case Ten:
                    break;
            }
            //loader.setLocation(getClass().getResource("../view/FirstPage.fxml"));
            Parent playerGUI = loader.load();
            // Controller controller = loader.getController();
            Scene playerScene = new Scene(playerGUI);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(playerScene);
            window.show();

        }
        //Groupstage
        public void initTable(){
            initCols();
            loadData();
        }

        public void initCols(){
            colPosition.setCellValueFactory(new PropertyValueFactory<>("Position"));
            colTeams.setCellValueFactory(new PropertyValueFactory<>("Teams"));
            colWins.setCellValueFactory(new PropertyValueFactory<>("Wins"));
            colLosses.setCellValueFactory(new PropertyValueFactory<>("Losses"));
            colDraws.setCellValueFactory(new PropertyValueFactory<>("Draws"));
            colPoints.setCellValueFactory(new PropertyValueFactory<>("Points"));
            editableCols();
        }
        private void editableCols(){
            colPosition.setCellFactory(TextFieldTableCell.forTableColumn());
            colPosition.setOnEditCommit(e->{
                e.getTableView().getItems().get(e.getTablePosition().getRow()).setPosition(e.getNewValue());


            });
            colTeams.setCellFactory(TextFieldTableCell.forTableColumn());
            colTeams.setOnEditCommit(e->{
                e.getTableView().getItems().get(e.getTablePosition().getRow()).setPosition(e.getNewValue());


            });
            colWins.setCellFactory(TextFieldTableCell.forTableColumn());
            colWins.setOnEditCommit(e->{
                e.getTableView().getItems().get(e.getTablePosition().getRow()).setPosition(e.getNewValue());


            });
            colLosses.setCellFactory(TextFieldTableCell.forTableColumn());
            colLosses.setOnEditCommit(e->{
                e.getTableView().getItems().get(e.getTablePosition().getRow()).setPosition(e.getNewValue());


            });
            colDraws.setCellFactory(TextFieldTableCell.forTableColumn());
            colDraws.setOnEditCommit(e->{
                e.getTableView().getItems().get(e.getTablePosition().getRow()).setPosition(e.getNewValue());


            });
            colPoints.setCellFactory(TextFieldTableCell.forTableColumn());
            colPoints.setOnEditCommit(e->{
                e.getTableView().getItems().get(e.getTablePosition().getRow()).setPosition(e.getNewValue());


            });
            tblGroupStage.setEditable(true);



        }
        private void loadData(){
            ObservableList<TeamStats> dataTable= FXCollections.observableArrayList();
            for(int i =0;i<10; i++){
                dataTable.add(new TeamStats(String.valueOf(i),"teams" +i,1+i,1 +i,1+i,1+i));
                tblGroupStage.setItems(dataTable);
            }
        }


    }


