import java.util.Scanner;

class DivideWithoutOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        int sign = 1;

        if (dividend < 0) {
            dividend = -dividend;
            sign = -sign;
        }

        if (divisor < 0) {
            divisor = -divisor;
            sign = -sign;
        }

        int quotient = 0;

        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }

        if (sign == -1) {
            quotient = -quotient;
        }

        System.out.println(quotient);
    }
}
