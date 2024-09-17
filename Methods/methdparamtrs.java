package Methods; 


public class methdparamtrs {
    public static void main(String[] args) {
        average(4, 6, true);
        System.out.println("calling a new method");
        return;
    }

    // new method// 
    public static int average(int a , int b, boolean shouldAver )
    {
        if(shouldAver == false ){
            return -1;
        }
        int avg = (a+b)/2; 
        System.out.println("Average is "+avg);
        System.out.println("shouldAver = "+shouldAver);
       return avg;// return is like ending the code at that time //
    }
}

