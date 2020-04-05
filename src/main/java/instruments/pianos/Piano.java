package instruments.pianos;

import behaviour.IPLay;
import behaviour.PianoStyle;

public class Piano implements IPLay {

    private String Model;
    private PianoStyle pianoStyle;

    public Piano(String model, PianoStyle pianoStyle){
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

}
