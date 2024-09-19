import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/**
 * nestedif
 */
public class nestedif {

    public static void main(String[] args) {
        
        Scanner pop = new Scanner(System.in);

        System.out.println("Enter your name "); 
        String libraryName = pop.nextLine();
        System.out.println("Enter your Enrollment number - ");
        int enrollNumber = pop.nextInt();


        System.out.println("Your name = "+libraryName);
        System.out.println("Your enroll number"+enrollNumber);
      
        if (enrollNumber < 1000)// the number of student which are enrolled are upto 1000//
        {
            System.out.println("enter Your approvemnt number");
            int approveStudent = pop.nextInt();

            if (approveStudent <= 200) {
                System.out.println("You can issue book ");
            }
            else{
                System.out.println("You have to wait till aprrovement");
            }
        } 
        else {
            System.out.println("you have to wait");
        }
    
    }
}