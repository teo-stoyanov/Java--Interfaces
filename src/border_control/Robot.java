package border_control;

public class Robot implements Identifable {
    private String model;
    private String id;

    Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public boolean isFake(String number) {
        return id.endsWith(number);
    }
}
