public class Main {
    public static void main(String[] args) {
        int start = 100;
        int add = 1700;

        int bonus = 0;
        if (add > 1000) {
            bonus = add / 100;
        }

        int end = start + add + bonus;

        System.out.println("Итоговая сумма на счету клиента: " + end);
        System.out.println("Бонус: " + bonus);
    }
}
