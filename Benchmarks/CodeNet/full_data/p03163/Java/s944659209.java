import java.io.*;
import java.util.*;

public class Main {
    int N, W;
    int[][] items;

    long solve() {
        long[] dp = new long[W+1];
        long max = 0L;
        for (int i = 0; i < N; i++) {
            int weight = items[i][0];
            int value = items[i][1];
            for (int j = W - weight; j >= 1; j--) {
                if (dp[j] > 0) {
                    dp[j+weight] = Math.max(dp[j+weight], dp[j] + value);
                    max = Math.max(max, dp[j+weight]);
                }
                if (j == weight) {
                    dp[j] = Math.max(dp[j], value);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            max = Math.max(max, items[i][1]);
        }
        return max;
    }

    void main(FastScanner in, PrintWriter out) {
        N = in.nextInt();
        W = in.nextInt();
        items = new int[N][2];

        for (int i = 0; i < N; i++) {
            items[i][0] = in.nextInt();
            items[i][1] = in.nextInt();
        }
        out.println( solve() );
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Main m = new Main();
        m.main(in, out);
        out.close();
        in.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(InputStream in) { br = new BufferedReader(new InputStreamReader(in)); }
        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        public String nextLine() {
            String str = "";
            try { str = br.readLine();
            } catch (IOException e) { e.printStackTrace(); }
            return str;
        }
        public void close() throws IOException { br.close(); }
    }
}