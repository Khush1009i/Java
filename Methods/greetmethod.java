/* Methods in java
public == access specifier ; static == return type;
 void == method; int a, int b == parameter list
*/
  package Methods;
public class greetmethod {
    public static void main(String[] args) {

        System.out.println("this is so-called my family"); 

        //--//
        String name[]={ "khush", "Garvish" , "Manjula soni[mother of culprit]" , "Deepak soni[father of culprit]"};
        for(String names : name) {
        System.out.println("Family Members are = "+names);  
  }
       
   
    greet();// calling a maded method//
        
        
        //--//
        int sub[]= {20,16,39,55};
            System.out.println("Age of culprit = "+sub[0]);
            
    khush();  //calling third method //
 }
    // intializing a new method // 
    public static void greet() {
            System.out.println("Crime = Wanted to end the life");
            
            //--//
            String deathTarget[] = {"khush soni"};
            System.out.println("Death target = "+deathTarget[0]);
    }

    public static void khush(){
        System.out.println("Punishment = Hang till death");
    }
}
