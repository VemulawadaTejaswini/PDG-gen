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
        NSlimes solver = new NSlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class NSlimes {
        long[] prefix;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            long[][] dp = new long[n][n];
            prefix = new long[n];
            prefix[0] = arr[0];
            for (int i = 1; i < n; i++)
                prefix[i] = prefix[i - 1] + arr[i];
            for (long[] x : dp)
                Arrays.fill(x, (long) 1e18);
            for (int i = 0; i < n; i++)
                for (int j = i; j >= 0; j--)
                    if (j == i)
                        dp[i][j] = 0;
                    else {
                        for (int k = j; k < i; k++)
                            dp[j][i] = Math.min(dp[j][i], dp[j][k] + getPrefix(j, k) + dp[k + 1][i] + getPrefix(k + 1, i));
                    }
            pw.println(dp[0][n - 1]);
        }

        private long getPrefix(int i, int j) {
            long temp = prefix[j];
            if (i != 0)
                temp -= prefix[i - 1];
            return temp;
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

