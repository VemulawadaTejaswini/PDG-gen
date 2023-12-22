import java.io.*;
import java.util.*;

public class Main {

    void solve() throws IOException {
        int n = ni();
        String[] b = nsa(n);

        int[] cntRow = new int[n];
        int[] cntColumn = new int[n];

        boolean impossible = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i].charAt(j) == '#') {
                    impossible = false;
                    cntRow[i]++;
                    cntColumn[j]++;
                }
            }
        }
        if (impossible) {
            out.println(-1);
            return;
        }

        int cnt = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (cntColumn[i] != n) cnt++;

            int tmp = n - cntRow[i];
            if (cntColumn[i] == 0) tmp++;
            min = Math.min(min, tmp);
        }

        out.println(cnt + min);
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