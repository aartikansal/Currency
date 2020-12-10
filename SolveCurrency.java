
import java.util.ArrayList;
import java.util.List;
/*
Currencies
*/

public class SolveCurrency {

    public static void main(String[] args) {
        Person Aarti = new Person("Aarti");
        for (Money money : Aarti.getAllMoney()) {
            System.out.println(Aarti.name + " has a stash of " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    public static class Person {
        public String name;

        public Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new Euro(1000));
            allMoney.add(new USD(100));
            allMoney.add(new Ruble(6000));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}








