package birthday_celebration;

public class Pet implements Birthdateble {
    private String name;
    private String birthday;

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public boolean ckeckBirthday(String year) {
        String yearToCheck = this.birthday.split("/")[2];
        return year.equals(yearToCheck);
    }

    @Override
    public String  getBirthdate() {
        return this.birthday;
    }
}
