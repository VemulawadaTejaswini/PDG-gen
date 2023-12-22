/*input
7
6 7 8
8 8 3
2 5 2
7 8 6
4 6 8
2 3 4
7 5 1
*/
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author masterbios
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLinovaAndKingdom solver = new CLinovaAndKingdom();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLinovaAndKingdom {

        final int MAXN = (int) 1e5 + 10;
       
           int dp[][] = new int[MAXN][4];
           int a[] = new int[MAXN];
           int b[] = new int[MAXN];
           int c[] = new int[MAXN];

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
                c[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                dp[i][0] = dp[i][1] = dp[i][2] = dp[i][3] = -1;
            }
            out.println(solve(0, n, 3));

        }

        public int solve(int idx, int n, int state) {
            if (idx >= n) return 0;
            if (dp[idx][state] != -1) return dp[idx][state];
            int ans1 = 0, ans2 = 0, ans3 = 0, ans4 = 0;
            if (state == 3) {
                ans1 = max(a[idx] + solve(idx + 1, n, 0),
                            b[idx] + solve(idx + 1, n, 1),
                            c[idx] + solve(idx + 1, n, 2));
            } else if (state == 0) {
                ans2 = max(ans2, b[idx] + solve(idx + 1, n, 1),
                            c[idx] + solve(idx + 1, n, 2));
            } else if (state == 1) {
                ans3 = max(ans3, a[idx] + solve(idx + 1, n, 0),
                            c[idx] + solve(idx + 1, n, 2));
            } else if (state == 2) {
                ans4 = max(ans4, a[idx] + solve(idx + 1, n, 0),
                            b[idx] + solve(idx + 1, n, 1));
            }
            // System.out.println(ans1 + " " + ans2 + " " + ans3 + " " + ans4);
            return dp[idx][state] = max(ans1, ans2, ans3, ans4);
        }

        public int max(int ...a) {
            int max = Integer.MIN_VALUE;
            for (int i : a) max = Math.max(max, i);
            return max;
        }

        public int min(int ...a) {
            int min = Integer.MAX_VALUE;
            for (int i : a) min = Math.min(min, i);
            return min;
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
            while (tokenizer == null || !tokenizer.hasMoreElements()) {
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

