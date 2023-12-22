package codes;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class ABC109C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int X = in.nextInt();
        long[] arr = new long[N+1];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextLong();
        }
        arr[N] = X;
        Arrays.sort(arr);
        long ans = 0;
        for (int i = 0; i < N; i++) {
            long a = arr[i];
            long b = arr[i+1];
            if (i == 0) {
                ans = b-a;
            } else {
                ans = gcd(ans, b-a);
            }
        }
        out.println(ans);
    }

    public static long gcd(long m, long n) {
        return BigInteger.valueOf(m).gcd(BigInteger.valueOf(n)).longValue();
    }
}
