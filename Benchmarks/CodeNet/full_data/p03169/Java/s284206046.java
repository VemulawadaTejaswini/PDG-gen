/**
 * @author cplayer on 2018/6/23.
 * @version 1.0
 */

import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        try {
            InputReader in;
            PrintWriter out;
            boolean useOutput = false;
            // if (System.getProperty("ONLINE_JUDGE") == null) useOutput = true;
            if (useOutput) {
                FileInputStream fin = new FileInputStream(new File("src/data.in"));
                in = new InputReader(fin);
                FileOutputStream fout = new FileOutputStream(new File("src/data.out"));
                out = new PrintWriter(fout);
            } else {
                InputStream inputStream = System.in;
                in = new InputReader(inputStream);
                OutputStream outputStream = System.out;
                out = new PrintWriter(outputStream);
            }
            Solver solver = new Solver(in, out);
            solver.solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Solver {

        private InputReader cin;
        private PrintWriter cout;

        Solver (InputReader cin, PrintWriter cout) {
            this.cin = cin; this.cout = cout;
        }

        public void solve () {
            try {
                int n = cin.nextInt();
                int cnt[] = new int[4];
                Arrays.fill(cnt, 0);
                for (int i = 0; i < n; ++i) {
                    int dishNum = cin.nextInt();
                    cnt[dishNum]++;
                }
                double dp[][][] = new double[n + 1][n + 1][n + 1];
                for (int k = 0; k <= n; ++k) {
                    for (int j = 0; j <= n; ++j) {
                        for (int i = 0; i <= n; ++i) {
                            double res = 0;
                            if (i + j + k == 0 || i + j + k > n) continue;
                            if (i > 0) res += dp[i - 1][j][k] * 1.0 * i / (i + j + k);
                            if (j > 0) res += dp[i + 1][j - 1][k] * 1.0 * j / (i + j + k);
                            if (k > 0) res += dp[i][j + 1][k - 1] * 1.0 * k / (i + j + k);
                            res += 1.0 * n / (i + j + k);
                            dp[i][j][k] = res;
                        }
                    }
                }
                cout.println(dp[cnt[1]][cnt[2]][cnt[3]]);
            } catch (RuntimeException e) {
                e.printStackTrace();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 1000000);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}