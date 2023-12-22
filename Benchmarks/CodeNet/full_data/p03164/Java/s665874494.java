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
                // 本题中w很大，但是n * v很小，可以将价值和容量对换，将价值视为容量进行dp，记录的是使用的背包空间
                // 答案就从所有可能的价值中取最大的即可
                int n = cin.nextInt(), w = cin.nextInt();
                long dp[] = new long[100005 + 1];
                Arrays.fill(dp, Long.MAX_VALUE / 2);
                dp[0] = 0;
                for (int i = 0; i < n; ++i) {
                    int weight = cin.nextInt(), value = cin.nextInt();
                    for (int j = 100005 - value; j >= 0; --j) {
                        dp[j + value] = Math.min(dp[j + value], dp[j] + weight);
                    }
                }
                long res = Long.MIN_VALUE;
                for (int i = 0; i < 100005; ++i) {
                    if (dp[i] <= w) res = Math.max(res, i);
                }
                cout.println(res);
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