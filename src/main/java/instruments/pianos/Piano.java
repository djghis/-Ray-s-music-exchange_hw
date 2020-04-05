package instruments.pianos;

import behaviour.IPLay;
import behaviour.ISell;
import behaviour.PianoStyle;
import instruments.Instrument;

public class Piano extends Instrument implements IPLay, ISell {

    private String Model;
    private PianoStyle pianoStyle;

    public Piano(String model, PianoStyle pianoStyle, String make, String color, double buyingPrice, double sellingPrice){
        super(make, color, buyingPrice, sellingPrice);
        this.Model = model;
        this.pianoStyle = pianoStyle;
    }

    public String play() {
       String pianoSound = "";
        if(this.pianoStyle == pianoStyle.ACCOUSTIC){
            pianoSound = "ding ding";
        } if(this.pianoStyle == pianoStyle.ELECTRONIC){
            pianoSound = "Tchingwua wua";
        }
        return pianoSound;
    }

    public double getProfit() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }

    public double markUpPercentage() {
        return (this.getSellingPrice() - this.getBuyingPrice()) / this.getBuyingPrice() * 100 ;
    }
}
