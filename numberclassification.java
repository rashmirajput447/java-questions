import java.util.Scanner;
 public class numberclassification{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("the number is positive");
         } if
            (number<0){
                System.out.println("the number is negative");               
            }if (number%2 ==0){
                    System.out.println("the number is even");
            }else{
                 System.out.println("the number is odd");
            } if (number%5==0 && number%7==0){
                    System.out.println("the number is divisible by 5 and 7");

            }
        }
   }     
 