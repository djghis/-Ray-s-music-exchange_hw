package instruments.guitars;

import behaviour.IPLay;

public class Guitar implements IPLay {

    private String model;
    private int numOfStrings;
    private int numOfBrokenStrings;

    public Guitar(String model, int numOfStrings){
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
}
