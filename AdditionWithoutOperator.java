import java.util.Scanner;
  public class AdditionWithoutOperator{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
          System.out.println("enter the first number");
              int num1 = sc.nextInt();
           System.out.println("enter the second number");
              int num2 = sc.nextInt();
        while(num2 !=0){
            int carry = num1 & num2;
            num1 = num1 ^ num2;
            num2 = carry <<1;
        }
        System.out.println("sum =" +num1);
            sc.close();
    }
  }
