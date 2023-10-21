package model;

import java.util.Arrays;

public class Market{

    private String[] productName;

    private int[] priceOfProduct;

    public Market(String[] productName, int[] priceOfProduct ) {
        this.productName = productName;
        this.priceOfProduct = priceOfProduct;
    }

    public String getProductPrices() {
        return Arrays.toString(priceOfProduct);
    }

    public String getProductNames(){
        return Arrays.toString(productName);
    }
}
