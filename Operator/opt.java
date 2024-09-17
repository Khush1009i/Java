
// taking user input 
/*
in this case we create a new variable with the help of a predefined class called scanner
the class  = java.util.scanner or java.util.*
*/
import java.util.Scanner;

public class opt {
    public static void main(String[] args) { 

    Scanner death = new Scanner(System.in);
    //first name //
    System.out.println("Enter first-name");
    String firstName = death.nextLine();
    
    //age //
    System.out.println("Enter age ");
    int  age  = death.nextInt();
    System.out.println("Your name = "+firstName);
    System.out.println("Your age = "+age);
}
} 