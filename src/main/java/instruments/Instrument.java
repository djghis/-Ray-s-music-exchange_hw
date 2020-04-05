package instruments;

public abstract class Instrument {
    private String make;
    private String color;
    private String owner;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String make, String color, double buyingPrice, double sellingPrice){
        this.make = make;
        this.color = color;
        this.owner = "Shop";
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMake() {
        return make;
    }


    public String getColor() {
        return color;
    }

    public void changeColor(String color) {
        this.color = color;
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

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
