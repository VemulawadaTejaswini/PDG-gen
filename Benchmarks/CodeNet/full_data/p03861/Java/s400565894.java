 
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;  class Main  {
     public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         BigInteger a = scan.nextBigInteger();
         BigInteger b = scan.nextBigInteger();
         BigInteger x = scan.nextBigInteger();
          BigInteger count = BigInteger.valueOf(0) ; 
 
           BigInteger g   = (  b.subtract(a)  ).add(BigInteger.valueOf(1)) ;
         System.out.println(g.divide(x) );
     }
}
