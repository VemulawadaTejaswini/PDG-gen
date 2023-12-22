import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

    static boolean isPrime(long n) {
        //if(n == 1) return true;
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
        long limit = (long)Math.ceil(Math.sqrt(Math.min(A, B)));
        for(long i = 1; i <= limit; i++) {
            if(A % i > 0) continue;
            if(B % i > 0) continue;

            if(isPrime(i)) {
                cnt += 1;
                //System.out.println(i);
            }

        }


        System.out.print(cnt);
    }
}
//[B@25618e91
//[B@326de728
//