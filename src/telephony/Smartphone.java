package telephony;

import java.util.ArrayList;
import java.util.List;

class Smartphone implements Calleble,Browseble{
    private List<String> numbers;
    private List<String> websites;

    Smartphone(){
        this.numbers = new ArrayList<>();
        this.websites = new ArrayList<>();
    }

    List<String> getNumbers() {
        return this.numbers;
    }

    void addNumber(String number){
        for (Character num : number.toCharArray()) {
            if(!Character.isDigit(num)){
                throw new IllegalArgumentException("Invalid number!");
            }
        }
        this.numbers.add(number);
    }

    void addSite(String site){
        for (Character character : site.toCharArray()) {
            if(Character.isDigit(character)){
                throw new IllegalArgumentException("Invalid URL!");
            }
        }
        this.websites.add(site);
    }

    @Override
    public void browseWeb() {
         websites.forEach(System.out::println);
    }

    @Override
    public void callNumber() {
        numbers.forEach(System.out::println);
    }

}
