import java.math.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        long[] a = new long[n];
        long[] b = new long[n];
        long max_a = -1L;
        for( int i = 0; i < n; i++ ) {
            a[i] = in.nextLong();
            b[i] = in.nextLong();
            max_a = Math.max(max_a, a[i]);
        }
        BigInteger ct = new BigInteger(0+"");
        for( int i = 0; i < n; i++ ) {
            if(b[i] > max_a) {k -= b[i]; ct = ct.add(new BigInteger(1+""));}
        }
        BigDecimal dc = (new BigDecimal(k+"")).divide(new BigDecimal(max_a+""), RoundingMode.DOWN);
        ct = ct.add(dc.toBigInteger());
        System.out.println(ct.toString());
    }
}