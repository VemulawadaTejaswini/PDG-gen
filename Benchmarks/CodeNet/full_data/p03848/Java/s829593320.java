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
        int n = ni();
        int[] a = nia(n);

        long MOD = 1000000007;

        if (n % 2 == 1) {
            int[] cnt = new int[n];
            for (int i = 0; i < n; i++) {
                cnt[a[i]]++;
            }

            for (int i = 2; i < n; i += 2) {
                if (cnt[i] != 2) {
                    out.println(0);
                    return;
                }
            }

            if (cnt[0] != 1) {
                out.println(0);
                return;
            }
        } else {
            int[] cnt = new int[n];
            for (int i = 0; i < n; i++) {
                cnt[a[i]]++;
            }

            for (int i = 1; i < n; i += 2) {
                if (cnt[i] != 2) {
                    out.println(0);
                    return;
                }
            }
        }

        long i = 1;
        for (int j = 0; j < n / 2; j++) {
            i = (i * 2) % MOD;
        }

        out.println(i);
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