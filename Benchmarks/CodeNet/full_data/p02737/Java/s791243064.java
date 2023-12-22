import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    final int mod = 998244353;

    int mul(int x, int y) {
        return (int) ((x * 1L * y) % mod);
    }

    int add(int x, int y) {
        x += y;
        return x >= mod ? (x - mod) : x;
    }

    void solve() {
        int n = in.nextInt();
        List<Integer>[] g1 = readGraph(n), g2 = readGraph(n), g3 = readGraph(n);
        boolean[] p1 = new boolean[n];
        for (int i = n - 1; i >= 0; i--) {
            p1[i] = true;
            for (int to : g1[i]) {
                if (p1[to]) {
                    p1[i] = false;
                    break;
                }
            }
        }
        boolean[] np1 = new boolean[n];
        for (int i = n - 1; i >= 0; i--) {
            np1[i] = true;
            if (p1[i]) {
                np1[i] = false;
            } else {
                for (int to : g1[i]) {
                    if (np1[to]) {
                        np1[i] = false;
                        break;
                    }
                }
            }
        }
        pow = new int[n + 2];
        pow[0] = 1;
        pow[1] = (int) (((long) 1e18) % mod);
        for (int i = 2; i < pow.length; i++) {
            pow[i] = mul(pow[i - 1], pow[1]);
        }
        int cp1 = calc(p1), cnp1 = calc(np1);
        int[] type = getTypeByGraph(g2);
        int costSquare = 0, costNotSquare = 0;
        for (int i = 0; i < n; i++) {
            if (type[i] == 1) {
                costSquare = add(costSquare, mul(cp1, pow[i + 1]));
                costNotSquare = add(costNotSquare, mul(cnp1, pow[i + 1]));
            } else if (type[i] == 2) {
                costSquare = add(costSquare, mul(cnp1, pow[i + 1]));
                costNotSquare = add(costNotSquare, mul(cp1, pow[i + 1]));
            }
        }
        int[] type3 = getTypeByGraph(g3);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (type3[i] == 1) {
                res = add(res, mul(costSquare, pow[i + 1]));
            } else if (type3[i] == 2) {
                res = add(res, mul(costNotSquare, pow[i + 1]));
            }
        }
        out.println(res);
    }

    int[] getTypeByGraph(List<Integer>[] g2) {
        int n = g2.length;
        int[] type = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            boolean existP1 = false, existP2 = false;
            for (int to : g2[i]) {
                if (type[to] == 1) {
                    existP1 = true;
                } else if (type[to] == 2) {
                    existP2 = true;
                }
            }
            if (!existP1) {
                type[i] = 1;
            } else if (!existP2) {
                type[i] = 2;
            }
        }
        return type;
    }

    int calc(boolean[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]) {
                res = add(res, pow[i + 1]);
            }
        }
        return res;
    }

    int[] pow;

    List<Integer>[] readGraph(int n) {
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            g[Math.min(x, y)].add(Math.max(x, y));
        }
        return g;
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}