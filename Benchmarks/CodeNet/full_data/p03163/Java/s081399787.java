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
        int w = in.nextInt();
        int[] weights = new int[n];
        long[] values = new long[n];
        for (int i = 0; i < n; i++) {
            weights[i] = in.nextInt();
            values[i] = in.nextInt();
        }

        long[][] maxValue = new long[n][w + 1];
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < n; j++) {
                int nextWeight = i + weights[j];

                if (nextWeight > w) {
                    continue;
                }

                long nextValue = maxValue[j][i];
                for (int k = 0; k < n; k++) {
                    if (j == k) continue;
                    nextValue = Math.max(maxValue[k][i] + values[j], nextValue);
                }


                maxValue[j][nextWeight] = Math.max(maxValue[j][nextWeight], nextValue);
            }
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, maxValue[i][w]);
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
