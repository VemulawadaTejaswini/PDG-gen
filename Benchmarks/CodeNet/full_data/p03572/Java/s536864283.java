import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    private FastScanner in;
    private PrintWriter out;

    private void solve() {
        final int mod = (int) 1e9 + 7;
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt() - 1;
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt() - 1;
        }
        boolean[][] valid = new boolean[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                valid[i][j] = true;
                for (int k = 0; k <= j; k++) {
                    if (a[i] == b[k]) {
                        valid[i][j] = false;
                    }
                }
                for (int k = 0; k <= i; k++) {
                    if (a[k] == b[j]) {
                        valid[i][j] = false;
                    }
                }
            }
        }
        int[][] cntDiff = new int[n][n];
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(used, false);
                for (int k = 0; k <= i; k++) {
                    int val = a[k];
                    if (!used[val]) {
                        cntDiff[i][j]++;
                        used[val] = true;
                    }
                }
                for (int k = 0; k <= j; k++) {
                    int val = b[k];
                    if (!used[val]) {
                        cntDiff[i][j]++;
                        used[val] = true;
                    }
                }
            }
        }
        valid[n][n] = true;
        final int N = n / 3;
        int[][] dp = new int[n + 1][n + 1];
        int[][] prevDP = new int[n + 1][n + 1];
        dp[n][n] = 1;
        for (int pos = N - 1; pos >= 0; pos--) {
            int[][] tmp = prevDP;
            prevDP = dp;
            dp = tmp;

            for (int i = 0; i < dp.length; i++) {
                Arrays.fill(dp[i], 0);
            }

            for (int i = n; i >= 0; i--) {
                for (int j = n; j >= 0; j--) {
                    if (i < n) {
                        prevDP[i][j] += prevDP[i + 1][j];
                        if (prevDP[i][j] >= mod) {
                            prevDP[i][j] -= mod;
                        }
                    }
                    if (j < n) {
                        prevDP[i][j] += prevDP[i][j + 1];
                        if (prevDP[i][j] >= mod) {
                            prevDP[i][j] -= mod;
                        }
                    }
                    if (i < n && j < n) {
                        prevDP[i][j] -= prevDP[i + 1][j + 1];
                        if (prevDP[i][j] < 0) {
                            prevDP[i][j] += mod;
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (valid[i][j]) {
                        int f = n - 3 * (N - pos - 1) - cntDiff[i][j];
                        if (f <= 0) {
                            continue;
                        }
                        long sumNext = prevDP[i + 1][j + 1];
                        sumNext %= mod;
                        sumNext *= f;
                        sumNext %= mod;
                        dp[i][j] = (int) sumNext;
                    }
                }
            }
        }
        long sum = dp[0][0];
        sum *= addInside(n / 3, mod);
        out.println(sum % mod);
    }

    long[] fact(final int n, final int mod) {
        long[] res = new long[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * i % mod;
        }
        return res;
    }

    int[][] c(final int n, final int mod) {
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            c[i][0] = 1;
            if (i == 0) {
                continue;
            }
            for (int j = 1; j < n; j++) {
                c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
                if (c[i][j] >= mod) {
                    c[i][j] -= mod;
                }
            }
        }
        return c;
    }

    long addInside(int n, int mod) {
        int[] dp = new int[2 * n + 1];
        dp[0] = 1;
        int[] ndp = new int[dp.length];
        long[] fact = fact(2 * n + 5, mod);
        int[][] c = c(2 * n + 5, mod);
        for (int i = 0; i < n; i++) {
            Arrays.fill(ndp, 0);
            for (int have = 0; have < dp.length; have++) {
                int cur = dp[have];
                if (cur == 0) {
                    continue;
                }
                int newHave = have + 2;
                for (int use = 0; use <= newHave; use++) {
                    int nextHave = newHave - use;
                    ndp[nextHave] += cur * 1L * c[newHave][use] % mod * fact[use] % mod;
                    if (ndp[nextHave] >= mod) {
                        ndp[nextHave] -= mod;
                    }
                }
            }
            int[] tmp = dp;
            dp = ndp;
            ndp = tmp;
        }
        return dp[0];
    }

    private void run() {
        try {
            in = new FastScanner(new File("CodeFestival_QualC_F.in"));
            out = new PrintWriter(new File("CodeFestival_QualC_F.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void runIO() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    private class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}