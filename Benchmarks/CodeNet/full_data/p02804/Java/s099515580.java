import java.util.*;
import java.io.*;
public class Main {
    static long MOD = 1000000007;
    static long[] facts = new long[100001];
    static long[] invs = new long[100001];
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        int K = nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = nextInt();
        }
        Arrays.sort(A);

        facts[0] = 1;
        invs[0] = 1;
        for (int i = 1; i < 100001; i++) {
            facts[i] = facts[i-1] * i % MOD;
            invs[i] = power(facts[i], MOD-2);
        }

        long maxSum = 0;
        for (int i = K; i <= N; i++) {
            maxSum += A[i-1] * ncr(i-1, K-1);
            maxSum = maxSum % MOD;
        }

        long minSum = 0;
        for (int i = N; i >= K; i--) {
            minSum += A[N-i] * ncr(i-1, K-1);
            minSum = minSum % MOD;
        }

        long sum = maxSum >= minSum ? maxSum - minSum : MOD + maxSum - minSum;
        System.out.println(sum % MOD);
    }

    public static long ncr(int n, int r) {
        return facts[n] * invs[r] % MOD * invs[n-r] % MOD;
    }

    // public static long fact(long n) {
    //     return n == 0 ? 1 : n * fact(n-1) % MOD;
    // }

    public static long power(long b, long n) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * b % MOD;
            }
            b = b * b % MOD;
            n = n >> 1;
        }
        return res;
    }

    public static String nextString() throws Exception {
        String res = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            res += (char)c;
        }
        return res;
    }

    public static int nextInt() throws Exception {
        return Integer.parseInt(nextString());
    }

    public static long nextLong() throws Exception {
        return Long.parseLong(nextString());
    }
}