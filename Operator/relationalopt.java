
/* 
operator   | description       |  Example  |
==         | is equal to       | returns true|
!=         | not equal to      | returns true|
>          | greater than      | returns true|
<          | less than         | returns true|
>=         | greater/equal to  | returns true|
<=         | less/equal to     | returns true|
*/
public class relationalopt {
    public static void main(String[] args) {
        int firstNumber = 12;
        int secondtNumber = 56;

        System.out.println("result "+(firstNumber = secondtNumber));
        System.out.println("result "+(firstNumber == secondtNumber));
        System.out.println("result "+(firstNumber != secondtNumber));
        System.out.println("result "+(firstNumber > secondtNumber));
        System.out.println("result "+(firstNumber < secondtNumber));
        System.out.println("result "+(firstNumber <= secondtNumber));
        System.out.println("result "+(firstNumber >= secondtNumber));
    }
    
}
