import java.util.Scanner;

class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;

        System.out.println(firstNumber);
        System.out.println(secondNumber);
    }
}
