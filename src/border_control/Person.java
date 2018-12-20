package border_control;

public class Person implements Identifable {
    private String name;
    private int age;
    private String id;

    Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }



    @Override
    public boolean isFake(String number) {
        return id.endsWith(number);
    }

    @Override
    public String getId() {
        return this.id;
    }
}
