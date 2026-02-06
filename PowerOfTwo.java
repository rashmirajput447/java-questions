import java.util.Scanner;

class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean result = number > 0 && (number & (number - 1)) == 0;
        System.out.println(result);
    }
}
