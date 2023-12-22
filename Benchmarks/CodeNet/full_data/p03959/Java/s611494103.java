import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int N = ni();
        int[] T = nia(N);
        int[] A = nia(N);

        long MOD = 1000000007L;

        int maxidx = -1;
        for (int i = 0; i < N; i++) {
            if (T[i] == A[i]) {
                maxidx = i;
                break;
            }
        }
        if (maxidx == -1) {
            out.println(0);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (i < maxidx) {
                if (T[i] > T[maxidx] || (i != 0 && T[i] < T[i - 1])) {
                    out.println(0);
                    return;
                }
            } else {
                if (T[i] != T[maxidx]) {
                    out.println(0);
                    return;
                }
            }
        }
        for (int i = N - 1; i >= 0; i--) {
            if (i > maxidx) {
                if (A[i] > A[maxidx] || i != (N - 1) && A[i] < A[i + 1]) {
                    out.println(0);
                    return;
                }
            } else {
                if (A[i] != A[maxidx]) {
                    out.println(0);
                    return;
                }
            }
        }

        long ans = 1;

        int t = T[0];
        for (int i = 1; i < maxidx; i++) {
            if (T[i] == t) {
                ans = (ans * t) % MOD;
            } else {
                t = T[i];
            }
        }

        int s = A[N - 1];
        for (int i = N - 2; i > maxidx; i--) {
            if (A[i] == s) {
                ans = (ans * s) % MOD;
            } else {
                s = A[i];
            }
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