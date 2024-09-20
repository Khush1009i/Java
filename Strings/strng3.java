package Strings;

import java.util.Scanner;
public class strng3 {
    public static void main(String[] args) {
      
        
        Scanner death= new Scanner(System.in);
        System.out.print("Enter your First name = ");
        String firstName = death.nextLine(); 

        System.out.print("Enter your Last name = ");
        String lastName = death.nextLine();

        System.out.println("Your name is "+ (firstName+" "+lastName) );
    }
}
