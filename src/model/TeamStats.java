package model;

public class TeamStats {
    private String position, teams;
    private int points;
    private int wins;
    private int losses;
    private int draws;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public TeamStats(String position, String teams, int wins, int losses, int draws, int points){
        this.position=position;
        this.teams=teams;
        this.wins=wins;
        this.losses=losses;
        this.draws=draws;
        this.points=points;
    }









}
