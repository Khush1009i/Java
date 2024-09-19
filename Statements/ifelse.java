import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        
        Scanner death = new Scanner(System.in);
        System.out.println("enter Your age ");
        int age = death.nextInt();
        
        if(age<56){
        System.out.println("You are approved");
        } 
         else{
            System.out.println("You're not approved");
        }
    }
}
