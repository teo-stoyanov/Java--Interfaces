package border_control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        List<Identifable> identifableList = new ArrayList<>();
        List<String> fakeIds = new LinkedList<>();

        while (true) {
            String[] input = console.readLine().split("\\s+");
            if ("End".equals(input[0])) {
                break;
            }

            switch (input.length) {
                case 2:
                    Robot robot = new Robot(input[0], input[1]);
                    identifableList.add(robot);
                    break;
                case 3:
                    Person person = new Person(input[0], Integer.parseInt(input[1]), input[2]);
                    identifableList.add(person);
                    break;
            }
        }

        String fakeNumber = console.readLine();

        identifableList.forEach(obj -> {
            if (obj.isFake(fakeNumber)) {
                fakeIds.add(obj.getId());
            }
        });

        fakeIds.forEach(System.out::println);
    }
}
