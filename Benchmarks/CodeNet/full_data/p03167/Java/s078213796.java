import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader inp = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(inp, out);
        out.close();
    }

    private static class Solver {
        private void solve(InputReader inp, PrintWriter out) {
            int h = inp.nextInt(), w = inp.nextInt();
            boolean[][] grid = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                char[] row = inp.next().toCharArray();
                for (int j = 0; j < w; j++) {
                    grid[i][j] = row[j] == '.';
                }
            }
            long MOD = 1000000007;
            long[][] dp = new long[h][w];
            dp[0][0] = 1;
            int row = 0, column = 0;
            while (row < h && column < w) {
                int i = 0;
                while (column + i < w && row - i >= 0) {
                    if (grid[row - i][column + i]) {
                        if (row - i - 1 >= 0)  {
                            dp[row - i][column + i] += dp[row - i - 1][column + i];
                        }
                        if (column + i - 1 >= 0) {
                            dp[row - i][column + i] += dp[row - i][column + i - 1];
                        }
                    }
                    dp[row - i][column + i] %= MOD;
                    i++;
                }
                if (row + 1 < h) row++;
                else column++;
            }
            out.print(dp[h-1][w-1]);
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
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
    }
}
