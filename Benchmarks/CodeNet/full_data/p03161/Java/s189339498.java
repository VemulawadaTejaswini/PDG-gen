import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            InputReader in;
            PrintWriter out;
            boolean useOutput = false;
            // if (System.getProperty("ONLINE_JUDGE") == null) useOutput = true;
            if (useOutput) {
                FileInputStream fin = new FileInputStream(new File("src/testdata.in"));
                in = new InputReader(fin);
                FileOutputStream fout = new FileOutputStream(new File("src/testData.out"));
                out = new PrintWriter(fout);
            } else {
                InputStream inputStream = System.in;
                in = new InputReader(inputStream);
                OutputStream outputStream = System.out;
                out = new PrintWriter(outputStream);
            }
            Solver solver = new Solver();
            solver.solve(in, out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Solver {

        public void solve(InputReader cin, PrintWriter cout) {
            try {
                int n = cin.nextInt(), k = cin.nextInt();
                int cost[] = new int[n], dp[] = new int[n];
                for (int i = 0; i < n; ++i) {
                    cost[i] = cin.nextInt();
                }
                dp[0] = 0;
                for (int i = 1; i < n; ++i) {
                    dp[i] = Integer.MAX_VALUE;
                    for (int j = Math.max(0, i - k); j < i; ++j) {
                        dp[i] = Math.min(dp[i], dp[j] + Math.abs(cost[i] - cost[j]));
                    }
                }
                cout.println(dp[n - 1]);
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
            reader = new BufferedReader(new InputStreamReader(stream));
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