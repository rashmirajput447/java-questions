import java.util.Scanner;

class MaxWithoutComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        int difference = firstNumber - secondNumber;
        int signBit = difference >> 31;
        int maxValue = firstNumber - (difference & signBit);

        System.out.println(maxValue);
    }
}
