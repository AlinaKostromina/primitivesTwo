public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int currentAmount = 200;

        int addedAmount = 6000;

        int conditionToAdd = 100;

        if (addedAmount > 1000) {
            System.out.println(currentAmount + addedAmount + (addedAmount / conditionToAdd));
        } else {
            System.out.println(currentAmount + addedAmount);
        }
    }
}