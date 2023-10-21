package model;

public class Player {
    private int health;

    private int armor;

    private int money;


    Player() {
        this.health=100;
        this.armor=0;
        this.money=800;
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

    public void setArmor(int arm){
        armor = arm;
    }

}
