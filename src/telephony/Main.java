package telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = console.readLine().split("\\s+");
        String[] webSites = console.readLine().split("\\s+");

        Smartphone smartphone = new Smartphone();
        for (String number : numbers) {
            try {
                smartphone.addNumber(number);
                System.out.println(String.format("Calling... %s",number));
            } catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }

        for (String webSite : webSites) {
            try {
                smartphone.addSite(webSite);
                System.out.println(String.format("Browsing: %s!",webSite));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

    }
}
