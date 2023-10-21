package model;

import java.util.Arrays;

public class Market{

    private final String[] skinName;

    private final int[] priceOfSkins;

    public Market(String[] skinName, int[] priceOfSkin ) {
        this.skinName = skinName;
        this.priceOfSkins = priceOfSkin;
    }

    public String getPriceOfSkin() {
        return Arrays.toString(priceOfSkins);
    }

    public String getSkins(){
        return Arrays.toString(skinName);
    }
}
