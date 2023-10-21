package model;

public enum Rank {
    IRON("Iron"),
    BRONZE("Bronze"),
    GOLD("Gold"),
    PLATIN("Platin"),
    DIAMOND("Diamond"),
    ASCENDANT("Ascendant"),
    IMMORTAL("Immortal"),
    RADIANT("Radiant");

    private int rankPoint;

    private String rank;
    Rank(String rank){
        this.rank=rank;
    }

    public void setRankPoint(int point){
        rankPoint = point;
    }

    public int getRankPoint(){
        return rankPoint;
    }

    public String getFullRank(){
        return rank + " " + rankPoint + " point";
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
