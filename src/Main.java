public class Main {
    public static void main(String[] args) {

        int check = 100; // начальный счет
        int money = 1300; // сумма пополнения

        int bonus;
        if (money > 1000) {
            bonus = (money / 100);
        } else {
            bonus = 0;
        }
        System.out.println("Итоговая сумма на счету клиента и бонусы.");
        System.out.println(((check + money + bonus) ) + " итоговая сумма");
        System.out.println((bonus) + " бонус(са/ов)");
    }
}
