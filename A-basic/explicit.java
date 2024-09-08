
/**
 - explicit == big items into small bucket ;
 in explicit their is a demerit that it makes some loss in data
 */
public class explicit {
    public static void main(String[] args) {
        
        long age = 1200;
        byte newAge = (byte)age;
        System.out.println(newAge);
     /*  like in this example the age is much more bigger than 
     the byte's  range so it will effect the  data , 
     the data loss will occur 
      */ 
    }
}