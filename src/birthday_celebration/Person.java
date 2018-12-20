package birthday_celebration;

public class Person implements Identifable,Birthdateble {
    private String name;
    private int age;
    private String id;
    private String birthday;

    Person(String name, int age, String id,String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }



    @Override
    public boolean isFake(String number) {
        return id.endsWith(number);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean ckeckBirthday(String year) {
        String yearToCheck = this.birthday.split("/")[2];
        return year.equals(yearToCheck);
    }

    @Override
    public String getBirthdate() {
        return this.birthday;
    }
}
