import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int[][] w = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                w[i][j] = in.nextInt();
            }
        }

        long[] costMask = new long[1 << n];
        for (int mask = 0; mask < (1 << n); mask++) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (((mask & (1 << i)) != 0) && ((mask & (1 << j)) != 0)) {
                        costMask[mask] += w[i][j];
                    }
                }
            }
        }

        long[] dp = new long[1 << n];
        for (int mask = 0; mask < (1 << n); mask++) {
            List<Integer> avlbl = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int temp = (1 << i);
                if ((temp & mask) == 0) {
                    avlbl.add(i);
                }
            }
            solve(mask, dp, avlbl, 0, 0, costMask);
        }
        out.println(dp[(1 << n) - 1]);
        out.close();
    }

    private static void solve(int mask, long[] dp, List<Integer> avlbl, int rem, int start, long[] costMask) {
        if (start == avlbl.size()) {
            int mask2 = mask ^ rem;
            dp[mask2] = Math.max(dp[mask2], dp[mask] + costMask[rem]);
            return;
        }
        for (int i = start; i < avlbl.size(); i++) {
            solve(mask, dp, avlbl, rem, start + 1, costMask);
            solve(mask, dp, avlbl, rem ^ (1 << avlbl.get(i)), start + 1, costMask);
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}