import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tournament {

    private String amountOfTeams;
    private Config config;
    private boolean groupStage = false;
    private boolean playOffs = false;
    private int teamIndex = 1;
    private ArrayList players = new ArrayList();
    private ArrayList teams = new ArrayList();
    private Controller controller;


    public Tournament(Controller controller){
        this.controller=controller;

    }
    public void saveConfig(Config config){
        this.config = config;
    }

    public void setAmountOfTeams(String amountOfTeams){
        this.amountOfTeams = amountOfTeams;
        System.out.println(this.amountOfTeams);
    }

    public void groupStage() {
        if (groupStage){
            groupStage=false;
        }else if (!groupStage){
            groupStage=true;
        }
    }

    public void playoffs() {
        if (playOffs){
            playOffs=false;
        }else if (!playOffs){
            playOffs=true;
        }

    }

    public void addPlayer(List player){
        players.add(player);
        for (Object p : players){
           // System.out.println(p);
        }
    }

    public String toString(){
        return (String)amountOfTeams; //+ "\n" + groupStage + "\n" + playOffs + "\n" + players;
    }

//    public void addTeams(){
//        for (int i = 0; i < amountOfTeams; i++){
//
//
//            teamIndex++;
//        }
//    }




}
