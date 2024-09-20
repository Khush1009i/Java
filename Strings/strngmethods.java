package Strings;

/* 
 * strngmethods =>>
 |-------------------|-----------------------------------------------------------|
 | String methods    |explaination/description                                   |
 | toUpperCase()     |to print in capital letter                                 |
 | toLowerCase()     |to print in small letter                                   |
 | trim()            |to cut the space in b/w words                              | 
 | startsWith()      |to check two words starts is same or not                   | 
 | endsWith()        |to check two words ends is same or not                     |
 | equals()          |to check two string i same or not                          |
 | equalIgnoreCase() |to check the value of string is same or not                |
 | charAt()          |to chechk a specfic value of string                        |
 | valueOf()         |to convert any other keyword to string                     | 
 | replace()         |to replace any value in string to another                  | 
 | contains()        |to check wether the string has/hace the value or not       |
 | substring()       |to get a specific value from  any  string                  |
 | split()           |to split the string                                        |
 | toCharArray()     |to split the total string into single alphabet             |
 | isEmpty()         |to check wether the string is empty or not                 |
 |-------------------|-----------------------------------------------------------|
*/
public class strngmethods {
    public static void main(String[] args) {
        
   
    String name = "Khush soni 007";


    //-- upperCase --- lowerCase --//
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());


    //-- trim --//
    System.out.println("      Khush    ".trim()); // cuts the space


    //-- startsWith - endsWith --//  
    System.out.println("Carpet".startsWith("kaleen"));// true or false //
    System.out.println("Carpet".startsWith("kaleen"));// true or false //
    System.out.println("Kallen".endsWith("lena"));
    System.out.println("Kallen".endsWith("leen"));


    //--  equals - equalsIgnoreCase --// 
    System.out.println("Kallen".equals("lena"));
    System.out.println("Kaleen".equalsIgnoreCase("KALEEN"));


    //-- charAt --//  
    System.out.println("Kaleen Bhaiya".charAt(4));


    //-- valueOf --//
    int age = 23;
    String stringAge = String.valueOf(age);
    System.out.println(age+2);
    System.out.println(stringAge+12);


    //--  replace  --//
    String newName = name.replace("soni", "SONI");
    System.out.println("replaced value = "+newName);

    // -- contains --//
    System.out.println(name.contains("Soni"));

    //-- substring --//
    System.out.println("I love codeing".substring(2,5));

    //-- split --//
    String words[] = "i Love coding in Java".split(" ");
   for(String word : words  ) {
    System.out.println("split = "+word);
    }
    
    //-- toCharArray--//
    String colorName = "Brown";
    char letters[] = colorName.toCharArray();
    for(char letter :letters ){
        System.out.println("the letter is "+letter);
    }


    //-- isEmpty --//
    String animalName = "";
    if (animalName.isEmpty()) {
        System.out.println("empty");
    } else {
        System.out.println("It's not empty");
    }    

   }
}