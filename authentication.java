import java.util.Scanner;
 public class authentication{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String username = "admin";
        String password = "1234";
        int attempts = 0;
        boolean isLoggedIn = false;
        while (attempts <3){
            System.out.println("Enter username");
            String inputUsername = sc.nextLine();
            System.out.println("Enter password");
            String inputPassword = sc.nextLine();
            if(inputUsername.equals(username) && inputPassword.equals(password)){
                System.out.println("Login successful");
                isLoggedIn = true;
                break;
            }else {
                attempts++;
                System.out.println("Login unsuccessful  attempts left:"+(3-attempts));
            }
        }
        if(isLoggedIn){
            System.out.println("Account Locked due to many failed attempts");
        }
        sc.close();
        }   
    }
 