import java.util.Scanner;
 public class atmwithdrawal {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter account balance");
        int balance = sc.nextInt();
        System.out.println("Enter withdrawal amount");
         int withdrawal = sc.nextInt();
            if (withdrawal%100==0 && balance - withdrawal >= 500){
                balance = balance - withdrawal;
                System.out.println("withdrawal successful:remaining balance is"+ balance);
            }
            else {
                System.out.println("withdrawal unsuccessful");
                System.out.println("please check amount or minimum balance ");
            }
            sc.close();

        }

    }
 