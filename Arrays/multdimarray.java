import java.util.Arrays;

public class multdimarray {
    public static void main(String[] args) {
        //2D array //
        // int marks[][] = new int[5][3];

        // System.out.println(marks);//
// this will print out the memory id //

     int marks[][]= {
        {12, 13, 45},
        {13, 23, 46},
        {23, 34, 47},
        {24, 45, 48},
        {26, 56, 47},
        {19, 16, 37},
     }; 
//System.out.println(java.util.Arrays.deepToString(marks).replace("],", "],\n"));
            System.out.println(Arrays.deepToString(marks));
    }
}
