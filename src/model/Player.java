package model;

public class Player {
    private int health;

    private int armor;

    private int money;

    private int killCount;

    private int deathCount;

    private int assistCount;


    public Player() {
        this.health=100;
        this.armor=0;
        this.money=800;   //The values at the start of the match.
        this.killCount=0;
        this.deathCount=0;
        this.assistCount=0;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int mny){
        money = mny;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int hp){
        health = hp;
    }

    public int getArmor() {
        return armor;
    }

    public int getKillCount() {
        return killCount;
    }

    public void kill() {
        this.killCount++;
    }

    public int getDeathCount() {
        return deathCount;
    }

    public void died() {
        this.deathCount++;
    }

    public int getAssistCount() {
        return assistCount;
    }

    public void assist() {
        this.assistCount++;
    }

    public void setArmor(int arm){
        armor = arm;
    }

    public void hit(int damage){
        System.out.println(damage + " damage has taken");
        health -= damage;
    }

    public void buyAmor(){
        health+=50;
        armor=50;
    }

    public String getKDA(){
        return killCount + "/" + deathCount + "/" + assistCount;
    }

}
