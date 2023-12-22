import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer stok;

    String nextToken() throws IOException {
        while (stok == null || !stok.hasMoreTokens()) {
            String s = br.readLine();
            if (s == null) {
                return null;
            }
            stok = new StringTokenizer(s);
        }
        return stok.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    char nextChar() throws IOException {
        return (char) (br.read());
    }

    String nextLine() throws IOException {
        return br.readLine();
    }

    int sum(long x) {
        int res = 0;
        while (x > 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }

    void solve() throws IOException {
        int n = nextInt();
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        int ITER = 10000000;
        for (int i = n; i < n + ITER; i++) {
            int k = i % n;
            dp[k] = Math.min(dp[k], sum(i));
        }

        Random r = new Random(31);
        for (int k = 0; k < ITER; k++) {
            long p = Math.abs(r.nextLong());
            int kk = (int)(p % n);
            dp[kk] = Math.min(dp[kk], sum(p));
        }

        for (int k = 0; k < ITER / 20; k++) {
            long t = 1;
            for (int i = 0; i < 18; i++) {
                t = t * 10 + r.nextInt(2);
            }
            int kk = (int)(t % n);
            dp[kk] = Math.min(dp[kk], sum(t));
        }

        int t = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 10; k++) {
                    t = (j * 10 + k) % n;
                    dp[t] = Math.min(dp[t], dp[j] + k);
                }
            }
        }
        out.println(dp[0]);
    }

    void run() throws IOException {
        // br = new BufferedReader(new FileReader("dragons.in"));
        //out = new PrintWriter("dragons.out");
        // br = new BufferedReader(new FileReader("input.txt"));
        // out = new PrintWriter("output.txt");
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        br.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        // Locale.setDefault(Locale.US);
        new Main().run();
    }
}