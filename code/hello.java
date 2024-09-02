public class hello{ //class is a key word used to define a new class , public defines wether the class is public or private//
    public static void main (String args[] )
    /*
     - public , static , void 
     - main == is the entry point for the application. All other methods are invoked from the main() method.
     - string args[] == is a placeholder for information we want to pass into our prgrm 

    * these syntax allow the code to run in proper manner.
    * proper syntax helps JVM to convert the code to byte code.
     */
    {
     System.out.println(" Hello world!! ");
     /*
      -system    == class from core library provided by Java.
      - out      == it is the object that controls output.
      - println  == method that is assocaited with that object that recieves single argument 
      */
    }
}