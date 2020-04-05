package drums;

import behaviour.IPLay;

import java.awt.image.ImageProducer;

public class Drums implements IPLay {

    private String model;
    private int numOfDrums;
    private int numOfBassDrums;
    private int numOfCymbals;

    public Drums(String model, int numOfDrums, int numOfBassDrums, int numOfCymbals){
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
}
