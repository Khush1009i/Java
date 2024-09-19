
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        
        Scanner dec = new Scanner(System.in);

    //     // Account name //
    //     System.out.println("Enter your account name");
    //     String nameString = dec.nextLine();
    //    //Account number //
    //     System.out.println("Enter your account number - ");
    //     int accountNumber = dec.nextInt();

    //     //Output //
    //     System.out.println(nameString);
    //     System.out.println(accountNumber);

        
        System.out.println("Enter the amount ");
        int cash = dec.nextInt();
        
        // initial amount any account have is 1000 //
        
        if (cash <= 1000 )
     {
        System.out.println("U can withdraw cash ");
     } 
     else if(cash >= 1000) 
     { 
        System.out.println("Check the amount again ");  
     }  
      
     System.out.println("Enter the amount ");
     int amount = dec.nextInt();

     if (cash >= 1000 ) {
        System.out.println("You can withdraw");
     } 
     else 
        {
            System.out.println("you can't withdraw");

        }

    }
}


