import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int n = ni();
        long[][] c = new long[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                c[i][j] = nl();
            }
        }

        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long x = tileToLong(c[i]);
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            long x = tileToLong(c[i]);
            for (int j = i + 1; j < n; j++) {
                long y = tileToLong(c[j]);
                for (int k = 0; k < 4; k++) {
                    long[] t = new long[4];
                    long tmp = 1;
                    for (int l = 0; l < 4; l++) {
                        long[] c2 = new long[4];
                        c2[0] = c[i][l % 4];
                        c2[1] = c[i][(l + 1) % 4];
                        c2[2] = c[j][(k - l + 4) % 4];
                        c2[3] = c[j][(k - l + 5) % 4];
                        t[l] = tileToLong(c2);

                        int cnt = map.containsKey(t[l]) ? map.get(t[l]) : 0;

                        if (cnt > 0 && t[l] == x) cnt--;
                        if (cnt > 0 && t[l] == y) cnt--;
                        for (int m = 0; m < l; m++) {
                            if (cnt > 0 && t[l] == t[m]) cnt--;
                        }

                        long p = t[l] >> 48;
                        long q = t[l] >> 32 & (1L << 16) - 1;
                        long r = t[l] >> 16 & (1L << 16) - 1;
                        long s = t[l] & (1L << 16 - 1);

                        if (p == q && q == r && r == s) cnt *= 4;
                        else if (p == r && q == s) cnt *= 2;

                        tmp *= cnt;
                    }
                    ans += tmp;
                }
            }
        }

        out.println(ans / 3);
    }

    long tileToLong(long[] colors) {
        long ret = Long.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            long tmp = 0;
            tmp |= colors[i % 4] << 48;
            tmp |= colors[(i + 1) % 4] << 32;
            tmp |= colors[(i + 2) % 4] << 16;
            tmp |= colors[(i + 3) % 4];

            ret = Math.min(ret, tmp);
        }
        return ret;
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