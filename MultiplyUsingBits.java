import java.util.Scanner;

class MultiplyUsingBits {
    static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        int result = 0;
        int sign = 1;

        if (secondNumber < 0) {
            secondNumber = add(~secondNumber, 1);
            sign = -1;
        }

        while (secondNumber != 0) {
            if ((secondNumber & 1) == 1) {
                result = add(result, firstNumber);
            }
            firstNumber = firstNumber << 1;
            secondNumber = secondNumber >> 1;
        }

        if (sign == -1) {
            result = add(~result, 1);
        }

        System.out.println(result);
    }
}
