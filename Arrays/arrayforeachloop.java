// for each loop in arrays
public class arrayforeachloop {
    public static void main(String[] args) {
        
    String name[] = {"Manjula Soni" , "Deepak Soni", "Garvish", "Khush"};
        // for(int i = 0; i<name.length; i++){
        // System.out.println("Family members are " +name[i]);
        // }

        for(String names : name){
            System.out.println(names);
        }
// for age //

        int ages[] ={12, 14 , 34, 56, 67};{
            for(int i = 0; i< ages.length; i++){
                System.out.println("age"+ages[i]);

// for each loop //
                for(int age : ages){
                    System.out.println("age = "+age);


// summation of array//
        int numbers[]= {7,12,34,45,56,67,78,89,90};

        // int sum =0;
        // for(int number :numbers){
        //     sum += number;

        // }
        // System.out.println("sum is "+sum);
        //         }
        //     }
        // }



    // find smalles element in array //

    int min = Integer.MIN_VALUE;

    for (int number : numbers)
    {
        if(number > min){
            min = number;
            System.out.println("min is"+min);
        }

    }
    }
            }
        }
        

    }
}
        
