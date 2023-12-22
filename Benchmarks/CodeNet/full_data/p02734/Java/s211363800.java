
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static final int mod = 998244353, UNCALC = -1;
    static int n, s, a[], memo[][];

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        s = sc.nextInt();
        a = sc.nextIntArray(n);
        memo = new int[n][s + 1];
        for (int[] b : memo)
            Arrays.fill(b, UNCALC);
        int ans = 0;
        for (int i = 0; i < n; i++)
            ans = add(ans, dp(i, 0));
        out.println(ans);
        out.flush();
        out.close();
    }

    static int dp(int i, int sum) {
        if (i == n) return sum == s ? 1 : 0;
        if (memo[i][sum] != UNCALC) return memo[i][sum];
        int cnt = 0;
        if (sum == s) cnt = add(1, dp(i + 1, sum));
        else {
            if (sum + a[i] <= s) cnt = dp(i + 1, sum + a[i]);
            cnt = add(cnt, dp(i + 1, sum));
        }
        return memo[i][sum] = cnt;
    }

    static int add(int a, int b) {
        int c = a + b;
        if (c >= mod) c -= mod;
        return c;
    }


    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        boolean ready() throws IOException {
            return br.ready();
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        Scanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        int nextChar() throws IOException {
            return next().charAt(0);
        }

        int[] nextIntArray(int n) throws IOException {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

    }
}
