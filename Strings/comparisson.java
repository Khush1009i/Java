package Strings;

public class comparisson { 
    public static void main(String[] args) {
         
          String name = "Khush";
          String sameName = "KHUSH";
          String newKeywString = new String("Khush");
          
          System.out.println(sameName);
          System.out.println(newKeywString);

// we're comapring  string. using ==  //
// their is  astorage giffernce between the ways by which you assign any string assigning using "new" keyword stores them into heap memory //
//& assigning using String literal stores them into Stack memory //
          if (name == sameName) 
          {
            System.out.println("both are same");
          }


          if (sameName == newKeywString) {
            
          }
          else{
            System.out.println("Both are different");
          }

// comparing two string's inserted value by if (strng1.equal(strng2) )
          if (sameName.equals(newKeywString)) {
            System.out.println("both are same");
          }else{
            System.out.println("No. Not same");
          }
// if their is slight change in th evalue of strings like in sameName == KHUSH and name == khush thier is just capital letter differnce in both //
// in these type of cases we can use :- strng1.equalIgnoreCase(strng2) like as follow --
          if (name.equalsIgnoreCase(sameName)) {
            System.out.println("they are same");
          }

               

    }
}
    