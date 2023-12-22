import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Long.min;

public class Main {
    private static long modPow(long a, long x, long p) {
        //calculates a^x mod p in logarithmic time.
        long res = 1;
        while(x > 0) {
            if( x % 2 != 0) {
                res = (res * a) % p;
            }
            a = (a * a) % p;
            x /= 2;
        }
        return res;
    }

    private static long modInverse(long a, long p) {
        //calculates the modular multiplicative of a mod m.
        //(assuming p is prime).
        return modPow(a, p-2, p);
    }

    private static long modBinomial(long n, long k, long p) {
        // calculates C(n,k) mod p (assuming p is prime).
        long numerator = 1; // n * (n-1) * ... * (n-k+1)
        for (int i=0; i<k; i++) {
            numerator = (numerator * (n-i) ) % p;
        }

        long denominator = 1; // k!
        for (int i=1; i<=k; i++) {
            denominator = (denominator * i) % p;
        }

        // numerator / denominator mod p.
        return ( numerator* modInverse(denominator,p) ) % p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        long ans = 0;

        for (long a = 0; a <= N; a++) {
            long rem = K - (a * A);
            if (rem < 0) {
                break;
            }
            if (rem % B != 0) {
                continue;
            }
            long b = rem / B;
            if (b > N) {
                continue;
            }
            ans += (modBinomial(N, a, 998244353) * modBinomial(N, b, 998244353));
            ans %= 998244353;
        }

        System.out.println("" + ans);
    }
}
