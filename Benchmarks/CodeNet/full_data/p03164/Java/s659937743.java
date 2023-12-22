/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        long W = sc.nextLong();
        long[] weight = new long[N];
        long[] value = new long[N];
        for (int i = 0; i < N; i++) {
            weight[i] = sc.nextLong();
            value[i] = sc.nextLong();
        }

        HashMap<Long, Long> dp = new HashMap<>();
        dp.put(0L, 0L);
        long best = 0;
        // What's the best value achievable with weight W?
        for (int item = 0; item < N; item++) {
            long val = value[item];
            long wt = weight[item];
            for (long nextWt = W; nextWt - wt >= 0; nextWt--) {
                // We can either add to the first state or something that was
                // reachable already
                // This statement makes me feel safer but it's actually NOT necessary,
                // since we're jsut maximizing everything
                if (dp.containsKey(nextWt - wt)) {
                    long newVal = dp.get(nextWt - wt) + val;
                    long oldVal = 0;
                    if (dp.containsKey(nextWt)) {
                        // If there was an old value, maybe we won't update
                        oldVal = dp.get(nextWt);
                    }
                    if (newVal > oldVal) {
                        // Promptly update
                        dp.put(nextWt, newVal);
                        best = Math.max(best, newVal);
                    }
                }
            }
        }
        out.println(best);
        out.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        FastScanner(FileReader s) {
            br = new BufferedReader(s);
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        String nextLine() throws IOException { return br.readLine(); }

        double nextDouble() throws IOException { return Double.parseDouble(next()); }

        int nextInt() throws IOException { return Integer.parseInt(next()); }

        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}