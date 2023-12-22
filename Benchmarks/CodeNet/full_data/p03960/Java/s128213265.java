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
        String[] S = nsa(H);

        long sum = 0;
        for (int i = 0; i < W - 1; i++) {
            long x1 = 0;
            long x2 = 0;
            long x3 = 0;
            for (int j = 0; j < H; j++) {
                if (S[j].charAt(i) == S[j].charAt(i + 1)) {
                    x1++;
                }
                if (j != H - 1 && S[j].charAt(i) == S[j + 1].charAt(i + 1)) {
                    x2++;
                }
                if (j != H - 1 && S[j + 1].charAt(i) == S[j].charAt(i + 1)) {
                    x3++;
                }
            }
            sum += x1 + Math.min(x2, x3);
        }

        out.println(sum);
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