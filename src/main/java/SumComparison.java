public class SumComparison {
    public static void main(String[] args) {
        int value1 = 15;
        int value2 = 4;
        int value3 = 7;
        int value4 = 8;

        int first_sum = value1 + value2;
        int second_sum = value3 + value4;

        boolean FisrtSumIsGreater = first_sum > second_sum;
        System.out.println("Перша сума більша:" + FisrtSumIsGreater);

        first_sum += 1;
        second_sum -= 2;

        System.out.println(first_sum);
        System.out.println(second_sum);

    }
}
