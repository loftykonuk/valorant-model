package model;

public class  Match {

    public int firstTeamsScore;

    public int secondTeamsScore;

    public String firstTeamSide;

    public String secondTeamSide;

    public Match(){
        this.firstTeamsScore = 0;
        this.secondTeamsScore = 0;
        this.firstTeamSide= "Attacker";
        this.secondTeamSide= "Defender";
    }

    public int getFirstTeamsScore() {
        return firstTeamsScore;
    }

    public void setFirstTeamsScore(int firstTeamsScore) {
        this.firstTeamsScore = firstTeamsScore;
    }

    public int getSecondTeamsScore() {
        return secondTeamsScore;
    }

    public void setSecondTeamsScore(int secondTeamsScore) {
        this.secondTeamsScore = secondTeamsScore;
    }

    public String getFirstTeamSide() {
        return firstTeamSide;
    }

    public void setFirstTeamSide(String firstTeamSide) {
        this.firstTeamSide = firstTeamSide;
    }

    public String getSecondTeamSide() {
        return secondTeamSide;
    }

    public void setSecondTeamSide(String secondTeamSide) {
        this.secondTeamSide = secondTeamSide;
    }

    public String getMatchScore(){
        return firstTeamsScore + "-" + secondTeamsScore;
    }

    public void firstTeamRoundWin(){
        firstTeamsScore++;
    }

    public void secondTeamRoundWin(){
        secondTeamsScore++;
    }
}
