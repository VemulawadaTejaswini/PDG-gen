import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        BigInteger X = sc.nextBigInteger();
        BigInteger Y = sc.nextBigInteger();
        BigInteger sum = X;
        long count = 0;
        while( sum.compareTo(Y) != 1 ) {
            sum = sum.multiply( BigInteger.valueOf(2) );
            count++;
        }
        System.out.println(count);
    }
}
