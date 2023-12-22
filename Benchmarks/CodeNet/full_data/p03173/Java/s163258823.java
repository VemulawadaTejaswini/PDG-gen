import java.util.*;
import java.io.*;

// Template for atcoder
public class Main {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;
    final long MOD = 1000L * 1000L * 1000L + 7;
    private static final int[] dx = {0, -1, 0, 1};
    private static final int[] dy = {1, 0, -1, 0};

    int[] arr;
    long[][] dp;
    long[] pref;
    void solve() throws IOException {
        int N = nextInt();
        arr = nextIntArr(N);
        dp = new long[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], Long.MAX_VALUE);
        }
        pref = new long[1 + N];
        for (int i = 1; i <= N; i++) {
            pref[i] = pref[i - 1] + arr[i - 1];
        }
        long res = rec(0, N - 1) - pref[N];
        outln(res);
    }

    long rec(int start, int end) {
        if (start > end) {
            return 0;
        }
        if (start == end) {
            return arr[start];
        }
        if (dp[start][end] != Long.MAX_VALUE) {
            return dp[start][end];
        }

        long res = Long.MAX_VALUE;
        for (int i = start; i < end; i++) {
            // [start, i] [i + 1, end]
            long tmp = rec(start, i) + rec(i + 1, end);
            tmp += pref[end + 1] - pref[start];
            res = Math.min(res, tmp);
        }
        dp[start][end] = res;
        return res;
    }

    void shuffle(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            int tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;
        }
    }
    private void outln(Object o) {
        out.println(o);
    }
    private void out(Object o) {
        out.print(o);
    }
    public Main() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
    public static void main(String[] args) throws IOException {
        new Main();
    }

    public long[] nextLongArr(int n) throws IOException{
        long[] res = new long[n];
        for(int i = 0; i < n; i++)
            res[i] = nextLong();
        return res;
    }
    public int[] nextIntArr(int n) throws IOException {
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
            res[i] = nextInt();
        return res;
    }
    public String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                eof = true;
                return null;
            }
        }
        return st.nextToken();
    }
    public String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            eof = true;
            return null;
        }
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}
