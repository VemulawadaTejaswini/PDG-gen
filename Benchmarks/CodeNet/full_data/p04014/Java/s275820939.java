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
        long n = nl();
        long s = nl();

        if (n < s) {
            out.println(-1);
            return;
        }

        if (n == s) {
            out.println(n + 1);
            return;
        }

        for (long i = 2; i * i <= n; i++) {
            if (f(i, n) == s) {
                out.println(i);
                return;
            }
        }

        for (long i = (long) Math.sqrt(n); i >= 1; i--) {
            if ((n - s) / i > 1 && f((n - s) / i + 1, n) == s) {
                out.println((n - s) / i + 1);
                return;
            }
        }

        out.println(-1);
    }

    long f(long b, long n) {
        if (n < b) return n;
        else return f(b, n / b) + (n % b);
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