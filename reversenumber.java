import java.util.Scanner;
 public class reversenumber{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int reverse=0;
        int sum=0;
        int count=0;
        while(num>0){
            int digit = num%10;
            reverse= reverse*10 + digit;
            sum = sum + digit;
            count++;
            num = num/10;
        }
        System.out.println("reverse of the number is"+reverse);
        System.out.println("sum of the digit is "+sum);
        System.out.println("digit count is"+count);
    }
 }