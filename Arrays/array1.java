// Array //
/*
An array is a collection of elements of the same data type
 stored in contiguous memory locations. Think of it like a
 row of boxes, each box holding a value.
 exapmle =>
 - an int array - |12|37|23|34|.
 */


 //creating an array //

public class array1 {
    public static void main(String[] args) {
      
// square brackets represent makin of array //
    // int intArray[];
    // intArray= new int[5];//allocating memory to array //



    String nameArray[];
    nameArray= new String[5];
    nameArray [0] = "khush soni";
    nameArray [1] = "Priyanka Prajapat";
    nameArray [2] = "Gourav singh ";
    nameArray [3] = "Akshita soni";
    nameArray [4] = "Himanshu rana";
    
    int age[] = new int[5];
    age[0] = 15;
    age[1] = 25;
    age[2] = 35;
    age[3] = 45;
    age[4] = 55;

    // System.out.print(age[0]);
    // System.out.print(age[1]);
    // System.out.print(age[2]);
    // System.out.print(age[3]);
    // System.out.println(age[4]);
     

    // System.out.println(nameArray[0]);
    // System.out.println(nameArray[1]);
    // System.out.println(nameArray[2]);
    // System.out.println(nameArray[3]);
    // System.out.println(nameArray[4]);

// how to get size of array // 
    System.out.println("size of name array = "+nameArray.length);
    System.out.println("size of age array= "+age.length);

    //memory of array //
    System.out.println(age);
    System.out.println(nameArray);
    }
}
