package model;

public class Skin {
    private String skinName;

    private int skinPrice;

    private int weapon;

    public Skin(String skinName, int skinPrice, int weapon) {
        this.skinName = skinName;
        this.skinPrice = skinPrice;
        this.weapon = weapon;
    }

    public String getSkinName() {
        return skinName;
    }

    public void setSkinName(String skinName) {
        this.skinName = skinName;
    }

    public int getSkinPrice() {
        return skinPrice;
    }

    public void setSkinPrice(int skinPrice) {
        this.skinPrice = skinPrice;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }
}
