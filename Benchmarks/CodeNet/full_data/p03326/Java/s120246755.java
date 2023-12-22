import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    int n, m;
    long[] xs, ys, zs;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        m = sc.nextInt();
        xs = new long[n];
        ys = new long[n];
        zs = new long[n];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextLong();
            ys[i] = sc.nextLong();
            zs[i] = sc.nextLong();
        }
        solve();
    }

    void solve() {
        System.out.println(dfs(0, 0, 0, 0, 0));
    }

    long dfs(int cur, int k, long xSum, long ySum, long zSum) {
        if (k == m) {
            return Math.abs(xSum) + Math.abs(ySum) + Math.abs(zSum);
        }
        if (cur == n) {
            return 0;
        }
        if (n - cur < m - k) {
            return 0;
        }
        long ret = dfs(cur + 1, k, xSum, ySum, zSum);
        if (k < m) {
           ret = Math.max(ret, dfs(cur + 1, k + 1,
                   xSum + xs[cur], ySum + ys[cur], zSum + zs[cur]));
        }
        return ret;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
