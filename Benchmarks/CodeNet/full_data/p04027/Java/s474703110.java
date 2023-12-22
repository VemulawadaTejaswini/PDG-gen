

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
    private void solve() {
        int n = in.nextInt(), c = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            b[i] = in.nextInt();
        }
        int bigprime = 1000000007;
        int[][] sp_pow = new int[n][404];
        for (int i = 0; i < n; ++i) {
            sp_pow[i][0] = 1;
            for (int j = 1; j < 404; ++j) {
                sp_pow[i][j] = modprime((long)sp_pow[i][j - 1] * (long)a[i], bigprime);
            }
        }
        int[][] dp = new int[n + 1][c + 1];
        for (int i = 0; i < n + 1; ++i)
            dp[i][0] = 1;
        for (int i = 1; i < n + 1; ++i) {
            for (int j = 1; j < c + 1; ++j) {
                for (int k = j; k >= 0; --k) {
                    dp[i][j] = modprime(
                            dp[i][j] + modprime(
                                    (long)dp[i - 1][k] * (long)sp_pow[i - 1][j - k],
                                    bigprime),
                            bigprime);
                }
            }
        }
        out.println(dp[n][c]);
    }

    int modprime(long x, int prime) {
        return (int)(x % prime);
    }

    private class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    private FastScanner in;
    private PrintWriter out;


    private void run() {
        try {
            in = new FastScanner();
            out = new PrintWriter(new BufferedOutputStream(System.out));
            solve();
        } catch (Exception e) {
            throw e;
        } finally {
            out.close();
        }
    }


    public static void main(String[] arg) {
        new Main().run();
    }
}


