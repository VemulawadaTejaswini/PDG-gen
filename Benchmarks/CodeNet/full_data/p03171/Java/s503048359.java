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
        LDeque solver = new LDeque();
        solver.solve(1, in, out);
        out.close();
    }

    static class LDeque {
        int n;
        int[] arr;
        long[][][] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            memo = new long[2][n][n];
            for (long[][] x : memo)
                for (long[] y : x)
                    Arrays.fill(y, -1);
            pw.println(dp(0, n - 1, 0));
        }

        private long dp(int i, int j, int bool) {
            if (i > j)
                return 0;
            if (memo[bool][i][j] != -1)
                return memo[bool][i][j];
            if (bool == 0) {
                long left = arr[i] + dp(i + 1, j, bool ^ 1);
                long right = arr[j] + dp(i, j - 1, bool ^ 1);
                return memo[bool][i][j] = Math.max(left, right);
            } else {
                long left = -arr[i] + dp(i + 1, j, bool ^ 1);
                long right = -arr[j] + dp(i, j - 1, bool ^ 1);
                return memo[bool][i][j] = Math.min(left, right);
            }
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

