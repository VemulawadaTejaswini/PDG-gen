import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        KnapSack solver = new KnapSack();
        solver.solve(1, in, out);
        out.close();
    }

    static class KnapSack {
        static int n;
        static int w;
        static int[] weight;
        static int[] value;
        static long[][] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            w = sc.nextInt();
            weight = new int[n];
            value = new int[n];
            for (int i = 0; i < n; i++) {
                weight[i] = sc.nextInt();
                value[i] = sc.nextInt();
            }
            memo = new long[w + 1][n];
            for (long[] x : memo)
                Arrays.fill(x, -1);
            pw.println(dp(0, w));
        }

        private long dp(int idx, int rem) {
            if (rem < 0)
                return (int) -1e9;
            if (idx == n)
                return 0;
            if (memo[rem][idx] != -1)
                return memo[rem][idx];
            long take = 1l * value[idx] + dp(idx + 1, rem - weight[idx]);
            long leave = dp(idx + 1, rem);
            return memo[rem][idx] = Math.max(take, leave);
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

