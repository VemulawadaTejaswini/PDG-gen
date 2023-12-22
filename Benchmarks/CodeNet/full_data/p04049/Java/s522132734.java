import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int n = ni(), k = ni();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = ni() - 1;
            b[i] = ni() - 1;
        }

        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(d[i], INF);
        }
        for (int i = 0; i < n; i++) {
            d[i][i] = 0;
        }
        for (int i = 0; i < n - 1; i++) {
            d[a[i]][b[i]] = d[b[i]][a[i]] = 1;
        }

        warshallFloyd(d);

        int ans = INF;

        if (k % 2 == 0) {
            for (int i = 0; i < n; i++) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (d[i][j] > k / 2) cnt++;
                }
                ans = Math.min(ans, cnt);
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (Math.min(d[a[i]][j], d[b[i]][j]) > k / 2) cnt++;
                }
                ans = Math.min(ans, cnt);
            }
        }

        out.println(ans);
    }

    int INF = Integer.MAX_VALUE / 3;

    void warshallFloyd(int[][] d) {
        int n = d.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    d[j][k] = Math.min(d[j][k], d[j][i] + d[i][k]);
                }
            }
        }
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