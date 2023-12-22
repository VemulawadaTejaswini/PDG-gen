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
        long[] a = nla(7);

        long ans = a[1] * 2;
        
        boolean b1 = a[0] > 0;
        boolean b2 = a[3] > 0;
        boolean b3 = a[4] > 0;

        ans += a[0] / 2 * 4;
        a[0] %= 2;

        ans += a[3] / 2 * 4;
        a[3] %= 2;

        ans += a[4] / 2 * 4;
        a[4] %= 2;

        if (a[0] + a[3] + a[4] == 3) {
            ans += 6;
        } else if (a[0] + a[3] + a[4] == 2 && b1 && b2 && b3) {
            ans += 2;
        }

        out.println(ans / 2);
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