package Methods;
/*  Maths Class Methods
 Math.min(x,y)  == find the minimum numbe b/w x and y.
 Math.max(x,y)  == find the maximum numbe b/w x and y.
 Math.pow(x,y)  == find the power x^y.
 Math.sqrt(x)   == find square root of a number.
 Math.abs(x)    == give the absolute value of any number.
 Math.random(x) == always gives random number.
 Math.floor(x)  == round-off to least digit.
 Math.ceil(x)   == round-off to highest digit.
 Math.round(x)  == round-off's the given number.
 */
public class mathclassmthd {
    public static void main(String[] args) {
        int a= 7; int b=7*7;
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b)); 
        System.out.println(Math.sqrt(b));
        System.out.println(Math.pow(a, b));
        System.out.println(Math.abs(-a));
        System.out.println(Math.random());
        System.out.println(Math.floor(12.255658));
        System.out.println(Math.ceil(25.5658));
        System.out.println(Math.round(23.49980));
    }

    public static int getRandom(int a ,int b){
        // return (int )(Math.random()*6) +1;
        return (int )(Math.random()*(b -a + 1) );

    }
   
}

