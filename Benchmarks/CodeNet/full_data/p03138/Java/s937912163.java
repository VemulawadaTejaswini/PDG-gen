import java.util.*;
import java.math.*;
// not sure
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        long[] ary = new long[n];
        int MAX_BIT_COUNT = (new BigInteger(k+"")).bitLength();
        // number of 0s have to be greater
        for( int i = 0; i < n; i++ ) ary[i] = in.nextLong();
        long xor = 0L;
        for( int i = 0; i < MAX_BIT_COUNT; i++ ) {
            int ones = 0;
            for( int j = 0; j < n; j++ ) {
                if((ary[j]&(1L<<i)) >= 1 ) ones++;
            }
            // System.out.println(ones);
            if( ones <= Math.floor(n/2.0) ) xor += (1L<<i); // if 1 is less than 0s
        }

        long ans = 0L;
        for( long i : ary ) ans += (long) (i^xor);
        System.out.println(ans);
    }
}