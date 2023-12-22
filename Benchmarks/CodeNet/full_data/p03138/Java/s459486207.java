import java.util.*;
// not sure
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        long[] ary = new long[n];
        long xor = 0L; // XOR of everything
        long maxBitK = Long.highestOneBit(k); // highest one bit of K
        for( int i = 0; i < n; i++ ) {
            ary[i] = in.nextLong();
            xor ^= ary[i];
        }
        long answer = 0;
        if( n == 1 ) {
            answer = ary[0];
        } else {
            while( k < maxBitK ) {
                maxBitK >>= 1;
            }
            if( maxBitK < xor ) {
                for( long i : ary ) answer += i^xor;
            } else {
                for( long i : ary ) answer += i^maxBitK;
            }
        }
        System.out.println(answer);
    }
}