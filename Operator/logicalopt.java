
//Logical operators //
/*
 * Opertors      | Meaning                |  
&& (logical AND) | true bot are true      |
||(logical OR)   | true if anyone is true |
! (logical NOT)  | true if exp is false   | 
 */
public class logicalopt {
    public static void main(String[] args) {
        boolean firstExpression  =  true;
        boolean secondExpression =  true;
        
        System.out.println("Logical AND ="+ (firstExpression && secondExpression));
        System.out.println("Logical OR  ="+ (firstExpression || secondExpression));
        System.out.println("Logical NOT ="+ ( ! secondExpression));
        System.out.println("Logical NOT ="+ ( ! firstExpression));
    }
}
