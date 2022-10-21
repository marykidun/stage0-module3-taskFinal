package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {
        int sum;
        for (sum = 0; number > 0; sum = sum + number % 10, number = number / 10);

        System.out.println(sum);

    }
    public static void main (String[] args){
        calculateSum(1234);
    }
}
