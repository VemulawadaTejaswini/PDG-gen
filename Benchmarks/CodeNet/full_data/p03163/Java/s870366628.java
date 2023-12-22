import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static PrintWriter out;
    static CF_Reader in;
    static long[][] arr;
    static int n;
    static Long[][] dp;

    public static void main(String[] args) throws IOException {
        out = new PrintWriter(new OutputStreamWriter(System.out));
        in = new CF_Reader();

        n = in.intNext();
        long k = in.longNext();
        arr = new long[n][2];
        for (int i = 0; i < n; i++) arr[i] = new long[]{in.longNext(), in.longNext()};
        dp = new Long[n][(int)k + 1];
        for(Long[] row: dp) Arrays.fill(row, null);
        out.println(solve(0, k));

        out.close();
    }

    static long solve(int idx, long k) {
        if (idx >= n || k <= 0) return 0;
        if (dp[idx][(int)k] == null) {
            // skip
            long skip = solve(idx + 1, k);
            // add it
            long added = 0;
            if (arr[idx][0] <= k) added = arr[idx][1] + solve(idx + 1, k - arr[idx][0]);
            dp[idx][(int)k] = Math.max(skip, added);
        }
        return dp[idx][(int)k];
    }

    static class CF_Reader {
        BufferedReader br;
        StringTokenizer st;

        public CF_Reader() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        long longNext() throws IOException {
            return Long.parseLong(next());
        }

        int intNext() throws IOException {
            return Integer.parseInt(next());
        }

        double doubleNext() throws IOException {
            return Double.parseDouble(next());
        }

        char charNext() throws IOException {
            return next().charAt(0);
        }

        public int[] nextIntArray(final int n) throws IOException {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = intNext();
            return a;
        }

        public long[] nextLongArray(final int n) throws IOException {
            final long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = longNext();
            return a;
        }

        String line() throws IOException {
            return br.readLine().trim();
        }
    }
}
