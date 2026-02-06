import java.util.Scanner;

class SubtractWithoutOperator {
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

        int result = add(firstNumber, add(~secondNumber, 1));
        System.out.println(result);
    }
}
