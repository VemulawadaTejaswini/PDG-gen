import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    void solve() throws IOException {
        int n = ni();
        long[] a = nla(n);

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (a[idx] > a[i]) {
                idx = i;
            }
        }
        while (true) {
            int min = idx;
            for (int i = 1; i <= n; i++) {
                a[(idx - 1 + i) % n] -= i;
                if (a[min] > a[(idx - 1 + i) % n]) {
                    min = (idx - 1 + i) % n;
                }
            }
            if (a[min] <= 0) break;
            idx = min;
        }

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                out.println("NO");
                return;
            }
        }

        out.println("YES");
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

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}