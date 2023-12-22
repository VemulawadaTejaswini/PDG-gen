import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
       
   
       BigInteger a = input.nextBigInteger();
       BigInteger b = input.nextBigInteger();
       BigInteger x = input.nextBigInteger();
       BigInteger c = BigInteger.ZERO;
       for(BigInteger i=a; i.compareTo(b)<=0; i=i.add(BigInteger.ONE)){
           if(i.mod(x)==(BigInteger.ZERO))
               c=c.add(BigInteger.ONE);
           
       }
       
       
       System.out.println(c);
       
    }
}
