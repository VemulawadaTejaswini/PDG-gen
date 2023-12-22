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

        long[][] cost = new long[W][2];

        for (int i = 0; i < W; i++) {
            if (i != 0) {
                long sum = 0;
                for (int j = 0; j < H; j++) {
                    long tmp = 0;
                    char c = S[j].charAt(i);
                    for (int k = j; k < H; k++) {
                        tmp += S[k].charAt(i - 1) == c ? 1 : 0;
                    }
                    sum += tmp;
                }
                cost[i][0] = sum;
            }
            if (i != W - 1) {
                long sum = 0;
                for (int j = 0; j < H; j++) {
                    long tmp = 0;
                    char c = S[j].charAt(i);
                    for (int k = j; k < H; k++) {
                        tmp += S[k].charAt(i + 1) == c ? 1 : 0;
                    }
                    sum += tmp;
                }
                cost[i][1] = sum;
            }
        }

        long ans = 0;

        for (int i = 0; i < 1000; i++) {
            Long min = Long.MAX_VALUE;
            int idx = -1;
            for (int j = 0; j < W; j++) {
                if (cost[j][0] != 0 && cost[j][1] != 0 && cost[j][0] + cost[j][1] < min) {
                    min = cost[j][0] + cost[j][1];
                    idx = j;
                }
            }
            if (idx == -1) break;
            ans += min;
            cost[idx][0] = 0;
            cost[idx][1] = 0;
            if (idx != 0) cost[idx - 1][1] = 0;
            if (idx != W - 1) cost[idx + 1][0] = 0;
        }

        for (int i = 0; i < W; i++) {
            if (i != 0 && cost[i][0] != 0) {
                ans += cost[i][0];
                cost[i - 1][1] = 0;
            }
        }
        for (int i = 0; i < W; i++) {
            ans += cost[i][1];
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