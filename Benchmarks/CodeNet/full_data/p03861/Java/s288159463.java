 import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

   class Main {
     public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         BigInteger a = scan.nextBigInteger();
         BigInteger b = scan.nextBigInteger();
         BigInteger x = scan.nextBigInteger();
         BigInteger i = b.divide(x ).add(BigInteger.valueOf(1))   ;
         BigInteger j = a.divide(x).add(BigInteger.valueOf(1));
         BigInteger g   = ( i.subtract(j) )  ;
            
         if(a.mod(x).intValue() != 0){
            System.out.println(g  );
         }else{
            System.out.println(g .add(BigInteger.valueOf(1)));    
         }
     }
}
