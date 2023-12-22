import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    int h, w;

    void solve() throws IOException {
        h = ni();
        w = ni();
        int n = ni();

        HashMap<Long, Integer> map = new HashMap<>();
        long tmp;

        for (int i = 0; i < n; i++) {
            int a = ni() - 1;
            int b = ni() - 1;

            if (can(a, b)) {
                tmp = iitol(a, b);
                if (!map.containsKey(tmp)) {
                    map.put(tmp, 1);
                } else {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }

            if (can(a - 1, b - 1)) {
                tmp = iitol(a - 1, b - 1);
                if (!map.containsKey(tmp)) {
                    map.put(tmp, 1);
                } else {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }

            if (can(a - 1, b)) {
                tmp = iitol(a - 1, b);
                if (!map.containsKey(tmp)) {
                    map.put(tmp, 1);
                } else {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }

            if (can(a - 1, b + 1)) {
                tmp = iitol(a - 1, b + 1);
                if (!map.containsKey(tmp)) {
                    map.put(tmp, 1);
                } else {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }

            if (can(a, b - 1)) {
                tmp = iitol(a, b - 1);
                if (!map.containsKey(tmp)) {
                    map.put(tmp, 1);
                } else {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }

            if (can(a, b + 1)) {
                tmp = iitol(a, b + 1);
                if (!map.containsKey(tmp)) {
                    map.put(tmp, 1);
                } else {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }

            if (can(a + 1, b - 1)) {
                tmp = iitol(a + 1, b - 1);
                if (!map.containsKey(tmp)) {
                    map.put(tmp, 1);
                } else {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }

            if (can(a + 1, b)) {
                tmp = iitol(a + 1, b);
                if (!map.containsKey(tmp)) {
                    map.put(tmp, 1);
                } else {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }

            if (can(a + 1, b + 1)) {
                tmp = iitol(a + 1, b + 1);
                if (!map.containsKey(tmp)) {
                    map.put(tmp, 1);
                } else {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }
        }

        long[] cnt = new long[10];
        cnt[0] = (long)(h - 2) * (w - 2);

        for (int x : map.values()) {
            cnt[x]++;
            cnt[0]--;
        }

        for (int i = 0; i < 10; i++) {
            out.println(cnt[i]);
        }
    }

    long iitol(int a, int b) {
        return (long) a << 32 | b;
    }

    boolean can(int x, int y) {
        return x > 0 && x < h - 1 && y > 0 && y < w - 1;
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