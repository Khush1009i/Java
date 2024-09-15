/*nestedloop = loop inside a loop 
doesn't matter which loop it is */

public class nestedLoop {
    public static void main(String[] args) {

// a more way to print tha same pattern
for (int i = 0; i <= 5; i++) {
    for (int j = 0; j <= i; j++) {
    System.out.print(" * ");
    }
    System.out.println();
    }
    
    for (int k = 0; k < 5; k++) {
    for (int l = 0; l <= 5; l++) {
    System.out.print(l + " ");
    }
    System.out.println();
    }
  
// labelled break  method // 
// lostLoop:
// for (int i = 0; i <= 5; i++) {
//     for (int j = 0; j <= i;) { //j++
//     System.out.print(" * ");
//      break lostLoop;
//     }
//     System.out.println();
//     }
//outerLoop:  
//     for (int i = 0; i < 5; i++) {
//   int j = 0; 
//   while (j <= 5) {
//     if (j==3) 
//      break outerLoop;
//     {  
//     System.out.print(j + " ");
//     j++;
//   }
// }
//     System.out.println();
//     }
    
}

}