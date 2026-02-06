import java.util.Scanner;

class MultiplyBySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int result = (number << 3) - number;
        System.out.println(result);
    }
}
