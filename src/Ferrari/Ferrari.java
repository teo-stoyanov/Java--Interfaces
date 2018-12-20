package Ferrari;

public class Ferrari implements Car {
    private static final String MODEL_OF_FERRARI = "488-Spider";
    private String driver;
    private String model;

    Ferrari(String driver) {
        this.driver = driver;
        this.model = MODEL_OF_FERRARI;
    }

    @Override
    public String hitBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushGasPedal() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", this.model, hitBrakes(), pushGasPedal(), this.driver);
    }
}
