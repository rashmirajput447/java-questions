import java.util.Scanner;
 public class primenumberrangecheck{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the starting number");
        int start = sc.nextInt();
        System.out.println("enter the ending number");
        int end = sc.nextInt();
        System.out.println("prime number between"+start+"and"+end+"are");
           for(int num = start; num<=end; num++){
              if(num <= 1){
                continue;
              }
              boolean isprime = true;
               for(int i = 2; i<num; i++){
                     if(num%i == 0){
                        isprime = false;
                        break;
                     }
               }
               if(isprime){
                 System.out.println(num);
               }
           }
        }
     }
    