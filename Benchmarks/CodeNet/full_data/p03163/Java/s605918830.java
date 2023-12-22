import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static final int UNCALC = -1;
    static final long INF = (long) 1e18;
    static int n, w[], v[];
    static long memo[][];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        int W = sc.nextInt();
        v = new int[n];
        w = new int[n];
        memo = new long[n][W + 1];
        for (long[] a : memo)
            Arrays.fill(a, UNCALC);
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        out.println(dp(0, W));
        out.flush();
        out.close();
    }

    static long dp(int i, int rem) {
        if (rem < 0) return -INF;
        if (i == n) return 0;
        if (memo[i][rem] != UNCALC) return memo[i][rem];
        long take = v[i] + dp(i + 1, rem - w[i]);
        long leave = dp(i + 1, rem);
        return Math.max(take, leave);
    }

    static class Scanner {

        BufferedReader br;
        StringTokenizer st;

        Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }


    }

}