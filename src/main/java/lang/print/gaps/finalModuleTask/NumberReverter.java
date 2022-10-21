package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void revert(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            revert(number / 10);
        }
    }

    public static void main(String[] args) {
        revert(489);
    }
}
