public class SumComparison {
    public static void main(String[] args) {
        int value1 = 15;
        int value2 = 3;
        int value3 = 8;
        int value4 = 12;

        int first_sum = value1 + value2;
        int second_sum = value3 + value4;

        boolean FirstSumIsGreater = first_sum > second_sum;
        System.out.println("Перша сума більша: " + FirstSumIsGreater);

        first_sum += 1;
        second_sum -= 2;

        boolean UpdatedFirstSumIsGreater = first_sum > second_sum;
        System.out.println("Перша сума після збільшення більша: " + UpdatedFirstSumIsGreater);

        boolean AnySumIsEven = first_sum % 2 == 0 || second_sum % 2 == 0;
        System.out.println("Принаймні одна сума кратна 2: " + AnySumIsEven);
    }
}