package instruments.drums;

import behaviour.IPLay;
import behaviour.ISell;
import instruments.Instrument;


public class Drums extends Instrument implements IPLay, ISell {

    private String model;
    private int numOfDrums;
    private int numOfBassDrums;
    private int numOfCymbals;

    public Drums(String model, int numOfDrums, int numOfBassDrums, int numOfCymbals, String make, String color, double buyingPrice, double sellingPrice){
        super(make, color, buyingPrice, sellingPrice);
        this.model = model;
        this.numOfDrums = numOfDrums;
        this.numOfBassDrums = numOfBassDrums;
        this.numOfCymbals = numOfCymbals;

    }

    public String getModel() {
        return model;
    }

    public int getNumOfDrums() {
        return numOfDrums;
    }

    public void setNumOfDrums(int numOfDrums) {
        this.numOfDrums = numOfDrums;
    }

    public int getNumOfBassDrums() {
        return numOfBassDrums;
    }

    public void setNumOfBassDrums(int numOfBassDrums) {
        this.numOfBassDrums = numOfBassDrums;
    }

    public int getNumOfCymbals() {
        return numOfCymbals;
    }

    public void setNumOfCymbals(int numOfCymbals) {
        this.numOfCymbals = numOfCymbals;
    }

    public String play() {
        return "Boom Boom Boom ting";
    }


    public double getProfit() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }

    public double markUpPercentage() {
        return (this.getSellingPrice() - this.getBuyingPrice()) / this.getBuyingPrice() * 100 ;
    }
}
