import java.util.Scanner;

//ternary opertaors

public class ternary {
    public static void main(String[] args) {
         Scanner hap = new Scanner(System.in);

         System.out.println("Enter the value of a = ");
         int a = hap.nextInt();

         System.out.println("Enter the value of b = ");
         int b = hap.nextInt();


         System.out.println("Enter the value of c12 = ");
         int c = hap.nextInt();


        // int a= 12;
        // int b =123;
        // int c = 45;

         int result = 0;
         
         result = a > b ? a > c ? a : c : b >  b ? b : a ; 
         System.out.println("result = "+result);


        
     }
}
