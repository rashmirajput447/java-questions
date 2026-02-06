package practicegithub;
    
import java.util.Scanner;
public class bill {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter item price");
        double prince = sc.nextDouble();
        System.out.println("enter item quantity");
        int quantity = sc.nextInt();
        double total = prince*quantity;
        double discount = 0;
        if(total>=5000){
            discount = total*0.01;
        } else if(total>=2000){
            discount = total*0.05;
        } double finalamount = total - discount;
        double gst = finalamount*0.18;
        double netamount = finalamount+ gst;
       System.out.println(" total amount "+total);
       System.out.println(" discount "+discount);
       System.out.println("final amount "+ finalamount);
       System.out.println(" GST "+gst);
       System.out.println(" net amount "+ netamount);

        }
            

    }

    
