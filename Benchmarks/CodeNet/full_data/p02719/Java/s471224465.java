import java.util.*;
import java.math.*;
public class Main{
    public static void main(String args[]){
       Scanner cin = new Scanner(System.in);
       BigInteger a, b,d;
       while (cin.hasNext()){
           a = cin.nextBigInteger();
           b = cin.nextBigInteger();
           BigInteger c = BigInteger.valueOf(0); 
           d=a.remainder(b);
           if(a.remainder(b).compareTo(c) == 0)
        	   System.out.println(0);
           else{
        	   if(d.compareTo(d.subtract(b).abs()) > 0)
        		   System.out.println(d.subtract(b).abs());
        	   else
        		   System.out.println(d);
       }
       }
    }
}