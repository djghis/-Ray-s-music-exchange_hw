package behaviour;

public enum PianoStyle {

    ACCOUSTIC("accoustic"),
    ELECTRONIC("electronic");

    private final String style;

    PianoStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }
}
