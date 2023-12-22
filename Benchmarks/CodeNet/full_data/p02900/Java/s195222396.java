import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

    static long gcd(long p, long q) {
        if(q == 0) return p;
        return gcd(q, p % q);
    }

    static boolean isPrime(long n) {
        //if(n == 1) return false;
        long limit = (long)Math.ceil(Math.sqrt(n));
        for(long i = 2; i <= limit; i++) {
            if(limit % i > 0) return false;
        }

        return true;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cnt = 0;
        long A = sc.nextLong(), B = sc.nextLong();
        long gcd = gcd(A, B);
        //System.out.println(gcd);
        long limit = (long)Math.ceil(Math.sqrt(gcd));
        //System.out.printf("limit: %d%n", limit);

        for(long i = 1; i <= limit; i++) {
            if(gcd % i > 0) continue;
            if(gcd / i > limit && isPrime(gcd / i)) {
                cnt += 1;
            }
            if(isPrime(i)) {
                cnt += 1;
            }
        }

        System.out.print(cnt);
    }
}
//[B@25618e91
//[B@326de728
//