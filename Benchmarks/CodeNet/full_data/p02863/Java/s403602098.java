import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int t = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }

        int[][] maxSatisfaction = new int[n][t];
        int[][] maxSatisfactionRev = new int[n][t];

        for (int i = a[0]; i < t; i++) {
            maxSatisfaction[0][i] = b[0];
        }
        for (int i = 1; i < n; i++) {
            int time = a[i];
            int satisfaction = b[i];
            for (int j = 0; j < t; j++) {
                if (j + time >= t) break;
                maxSatisfaction[i][j + time] = Math.max(maxSatisfaction[i][j + time], maxSatisfaction[i - 1][j] + satisfaction);
            }
        }

        for (int i = a[n-1]; i < t; i++) {
            maxSatisfactionRev[n-1][i] = b[n-1];
        }
        for (int i = n - 2; i > 0; i--) {
            int time = a[i];
            int satisfaction = b[i];
            for (int j = 0; j < t; j++) {
                if (j + time >= t) break;
                maxSatisfactionRev[i][j + time] = Math.max(maxSatisfactionRev[i][j + time], maxSatisfactionRev[i + 1][j] + satisfaction);
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans = Math.max(ans, maxSatisfactionRev[i + 1][t - 1] + b[i]);
            } else if (i == n - 1) {
                ans = Math.max(ans, maxSatisfaction[i - 1][t - 1] + b[i]);
            } else {
                for (int j = 0; j < t; j++) {
                    ans = Math.max(ans, maxSatisfaction[i - 1][j] + maxSatisfactionRev[i + 1][t - j - 1] + b[i]);
                }
            }
        }

        out.println(ans);
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
