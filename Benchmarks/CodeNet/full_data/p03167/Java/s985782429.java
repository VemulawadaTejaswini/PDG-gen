import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {

        private static final int MODULO = 1000000007;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int R = in.nextInt(), C = in.nextInt();
            char[][] grid = new char[R][C];

            for (int i = 0; i < R; i++) {
                String s = in.next();
                for (int j = 0; j < C; j++)
                    grid[i][j] = s.charAt(j);
            }

//            int[][] dp = new int[R][C];
//            int res = numWays(grid, R - 1, C - 1, dp);
            int res = numWays2(grid);
            out.println(res);
        }

        public int numWays(char[][] grid, int i, int j, int[][] dp) {
            if (grid[i][j] == '#')
                return 0;

            if (i == 0 && j == 0)
                return 1;

            if (dp[i][j] != 0)
                return dp[i][j];

            int left = (j - 1) >= 0 ? numWays(grid, i, j - 1, dp) : 0;
            int top = (i - 1) >= 0 ? numWays(grid, i - 1, j, dp) : 0;
            dp[i][j] = (left + top) % MODULO;
            return dp[i][j];
        }

        public int numWays2(char[][] grid) {
            int R = grid.length, C = grid[0].length;
            int[][] dp = new int[R + 1][C + 1];

            for (int i = 1; i <= R; i++) {
                for (int j = 1; j <= C; j++) {
                    if (i == 1 && j == 1)
                        dp[i][j] = 1;
                    else if (grid[i - 1][j - 1] == '.')
                        dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MODULO;
                    else
                        dp[i][j] = 0;
                }
            }
            
            return dp[R][C];
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

