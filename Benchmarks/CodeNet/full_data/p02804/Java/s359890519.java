import java.util.*;
import java.io.*;
public class Main {
    static long MOD = 1000000007;
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

        long maxSum = 0;
        for (int i = K; i <= N; i++) {
            maxSum += A[i-1] * NCR(i-1, K-1);
            maxSum = maxSum % MOD;
        }

        long minSum = 0;
        for (int i = N; i >= K; i--) {
            minSum += A[N-i] * NCR(i-1, K-1);
            minSum = minSum % MOD;
        }

        long ans = maxSum >= minSum ? maxSum - minSum : MOD + maxSum - minSum;
        System.out.println(ans);
    }

    public static long NCR(int n, int r) {
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - r + i) / i;
            res = res % MOD;
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