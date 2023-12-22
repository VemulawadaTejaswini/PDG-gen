import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int H = ni();
        int W = ni();

        char[][] C = new char[H][W];
        for (int i = 0; i < H; i++) C[i] = ns().toCharArray();

        int ans = 0;
        for (int i = 0; i < W - 1; i++) {
            int[][] cost = new int[H + 1][H + 1];
            for (int j = H - 1; j >= 0; j--) {
                for (int k = H - 1; k >= 0; k--) {
                    cost[j][k] = cost[j + 1][k + 1] + (C[H - 1 - j][i] == C[H - 1 - k][i + 1] ? 1 : 0);
                }
            }

            int[][] dp = new int[H + 1][H + 1];
            for (int j = 0; j <= H; j++) {
                for (int k = 0; k <= H; k++) {
                    if (j > 0 && k > 0) {
                        dp[j][k] = Math.min(dp[j - 1][k] + cost[j - 1][k], dp[j][k - 1] + cost[j][k - 1]);
                    } else if (j > 0) {
                        dp[j][k] = dp[j - 1][k] + cost[j - 1][k];
                    } else if (k > 0) {
                        dp[j][k] = dp[j][k - 1] + cost[j][k - 1];
                    }
                }
            }

            ans += dp[H][H];
        }

        out.println(ans);
    }

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}