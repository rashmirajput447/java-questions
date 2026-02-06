import java.util.Scanner;
public class salarycalculator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary");
        double basic = sc.nextDouble();
        double hra,da,pf;
        double totalsalary;
        if(basic>=30000){
            hra = basic * 0.20;
            da = basic * 0.15; 
            pf = basic * 0.12;   
       } else {
          hra = basic *0.10;
          da = basic * 0.08;
          pf = basic * 0.12;
       }
       totalsalary = basic + hra + da - pf; 

    System.out.println("Basic salary" + basic);
    System.out.println("Hra" + hra);
    System.out.println("Da" + da);
    System.out.println("Pf" + pf);
    System.out.println("Totalsalary ="  + totalsalary);
     }
}
