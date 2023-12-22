import java.io.*;
import java.util.*;

public class Main {
    int N, K;
    int[] nums;

    int solve() {
        int[] dp = new int[N+1];
        for (int i = 2; i <= N; i++) {
            int len = K;
            if (i < K) len = i;

            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= len; j++) {
                min = Math.min(min, Math.abs(nums[i]-nums[i-j]) + dp[i-j]);
            }
            dp[i] = min;
        }
        return dp[N];
    }

    void main(FastScanner in, PrintWriter out) {
        N = in.nextInt();
        K = in.nextInt();
        nums = new int[N+1];
        nums[0] = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            nums[i] = in.nextInt();
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