package sparesAndAddons;

import behaviour.ISell;

public abstract class ItemsForSale implements ISell {

    private String item;
    private String owner;
    private double buyingPrice;
    private double sellingPrice;

    public ItemsForSale(String item, double buyingPrice, double sellingPrice){
        this.item = item;
        this.owner = "Shop";
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getItem() {
        return item;
    }

    public void changeItemName(String item) {
        this.item = item;
    }

    public String getOwner() {
        return owner;
    }

    public void changeOwner(String owner) {
        this.owner = owner;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
