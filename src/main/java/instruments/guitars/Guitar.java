package instruments.guitars;

import behaviour.IPLay;
import behaviour.ISell;
import instruments.Instrument;

public class Guitar extends Instrument implements IPLay, ISell {

    private String model;
    private int numOfStrings;
    private int numOfBrokenStrings;

    public Guitar(String model, int numOfStrings, String make, String color, double buyingPrice, double sellingPrice){
        super(make, color, buyingPrice, sellingPrice);
        this.model = model;
        this.numOfStrings = numOfStrings;
        this.numOfBrokenStrings = 0;

    }

    public String getModel() {
        return model;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public int getNumOfBrokenStrings() {
        return numOfBrokenStrings;
    }

    public void setNumOfBrokenStrings(int numOfBrokenStrings) {
        this.numOfBrokenStrings = numOfBrokenStrings;
    }

    public String play() {
        return "pingthchua chua";
    }



    public double getProfit() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }

    public double markUpPercentage() {
        return (this.getSellingPrice() - this.getBuyingPrice()) / this.getBuyingPrice() * 100 ;
    }
}
