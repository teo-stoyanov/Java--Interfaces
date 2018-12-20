package person_modification;

public class Citizen implements Person,Identifiable,Birthable {
    private String name;
    private int age;
    private String id;
    private String birthday;

    Citizen(String name, int age, String id, String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String birthday() {
        return this.birthday;
    }

    @Override
    public String id() {
        return this.id;
    }
}
