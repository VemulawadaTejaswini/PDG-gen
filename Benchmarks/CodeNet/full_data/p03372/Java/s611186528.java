import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static long c;
    static long[] xs, vs;
    static Map<Long, Integer> compressedX;
    static long[][][] dp;
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        c = sc.nextLong();
        xs = new long[n + 2];
        vs = new long[n + 2];
        xs[0] = 0;
        xs[n + 1] = c;
        vs[0] = 0;
        vs[n + 1] = 0;
        dp = new long[n + 2][n + 2][n + 2];
        compressedX = new HashMap<>();
        compressedX.put(0l, 0);
        for (int i = 1; i <= n; i++) {
            xs[i] = sc.nextLong();
            compressedX.put(xs[i], i);
            vs[i] = sc.nextLong();
        }

        System.out.println(rec(1, n, 0));
        /*
        // counterclockwise
        long counterClockSum = 0;
        long[] counterClockDP = new long[n + 1];
        for (int i = 0; i < n; i++) {
            counterClockDP[i + 1] = Math.max(counterClockDP[i + 1],
                    counterClockDP[i] + vs[i] - xs[i] + xs[i - 1]);
        }
        for (int i = n - 1; i > 0; i--) {
            if (vs[i] > xs[i] - xs[i - 1]) {
                counterClockSum += vs[i] - xs[i] + xs[i - 1];
            }
        }
        */
    }

    static long rec(int next, int prev, long now) {
        if (next > prev) return 0;
        int compressedNow = compressedX.get(now);
        if (dp[next][prev][compressedNow] > 0) return dp[next][prev][compressedNow];
        long nextDistance = (xs[next] + c - now) % c;
        long prevDistance = (now + c - xs[prev]) % c;
        long ans = Math.max(0, Math.max(
                rec(next + 1, prev, xs[next]) + vs[next] - nextDistance,
                rec(next, prev - 1, xs[prev]) + vs[prev] - prevDistance));
        dp[next][prev][compressedNow] = ans;
        return ans;
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
