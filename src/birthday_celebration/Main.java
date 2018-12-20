package birthday_celebration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        List<Birthdateble> birthdatebleList = new ArrayList<>();
        List<String> bithdayList = new LinkedList<>();

        while (true) {
            String[] input = console.readLine().split("\\s+");
            if ("End".equals(input[0])) {
                break;
            }

            switch (input[0]){
                case "Citizen":
                    Person person = new Person(input[1],Integer.parseInt(input[2]),input[3],input[4]);
                    birthdatebleList.add(person);
                    break;
                case "Pet":
                    Pet pet = new Pet(input[1],input[2]);
                    birthdatebleList.add(pet);
                    break;
            }
        }

        String year = console.readLine();

        birthdatebleList.forEach(obj -> {
            if(obj.ckeckBirthday(year)){
                bithdayList.add(obj.getBirthdate());
            }
        });

        bithdayList.forEach(System.out::println);
    }
}
