public class Main {
    public static void main(String[] args) {

        int startingBalance = 100;
        int replenishmentAmount = 1000;

        int currentBalance;
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
            currentBalance = startingBalance + replenishmentAmount + bonus;
        } else {
            bonus = 0;
            currentBalance = startingBalance + replenishmentAmount;
        }
        System.out.println("Текущий баланс: " + currentBalance);
        System.out.println("Количество начисленных бонусов: " + bonus);
    }
}