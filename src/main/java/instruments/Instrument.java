package instruments;

public abstract class Instrument {
    private String make;
    private String color;
    private String owner;

    public Instrument(String make, String color){
        this.make = make;
        this.color = color;
        this.owner = "Shop";
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
}
