import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    char[][] a;
    int[][] dp;
    int[][] dp2;
    int n;

    char get(int x, int y) {
        x = ((x % n) + n) % n;
        y = ((y % n) + n) % n;
        return a[x][y];
    }

    int getDp(int x, int y) {
        x = ((x % n) + n) % n;
        y = ((y % n) + n) % n;
        return dp[x][y];
    }

    int getDp2(int x, int y) {
        x = ((x % n) + n) % n;
        y = ((y % n) + n) % n;
        return dp2[x][y];
    }

    void solve() {
        n = in.nextInt();
        a = new char[n][];
        for (int i = 0; i < n; i++) {
            a[i] = in.next().toCharArray();
        }
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (get(i + k, j - k) == get(i - k, j +k)) {
                        dp[i][j] = k;
                    } else {
                        break;
                    }
                }
            }
        }
        dp2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (get(i + k - 1, j - k + 1) == get(i - k, j + k)) {
                        dp2[i][j] = k;
                    } else {
                        break;
                    }
                }
            }
        }
        int res = 0;
        for (int dx = 0; dx < n; dx++) {
            for (int dy = 0; dy < n; dy++) {
                boolean ok = true;
                for (int i = 0; i < n; i++) {
                    int val = getDp(i + dx, i + dy);
                    int l = Math.min(i, n - 1 - i);
                    if (l > val) {
                        ok = false;
                        break;
                    }
                    if (i != n - 1) {
                        int val2 = getDp2(i + dx + 1, i + dy);
                        int l2 = 1 + Math.min(i, n - 2 - i);
                        if (l2 > val2) {
                            ok = false;
                            break;
                        }
                    }
                }
                if (ok) {
                    res++;
                }
            }
        }
        out.println(res);
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