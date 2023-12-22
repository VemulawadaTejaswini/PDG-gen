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
        OMatching solver = new OMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class OMatching {
        int n;
        int[][] arr;
        int mod = (int) 1e9 + 7;
        long[] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            arr = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            memo = new long[1 << n];
            Arrays.fill(memo, -1);
            pw.println(dp(0, 0) % mod);
        }

        private long dp(int idx, int msk) {
            if (idx == n)
                return 1;
            if (memo[msk] != -1)
                return memo[msk];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if ((msk & 1 << i) != 0)
                    continue;
                if (arr[idx][i] == 1)
                    sum += dp(idx + 1, msk | 1 << i);
                sum %= mod;
            }
            return memo[msk] = sum;
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

