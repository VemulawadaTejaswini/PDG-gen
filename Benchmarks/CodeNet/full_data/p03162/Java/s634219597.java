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

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int[][] arr = new int[N][3];
            for (int i = 0; i < N; i++) {
                arr[i][0] = in.nextInt();
                arr[i][1] = in.nextInt();
                arr[i][2] = in.nextInt();
            }

            int[][] dp = new int[N][3];

            int res = maxPoints(arr, -1, 0, dp);
            out.println(res);
        }

        public int maxPoints(int[][] arr, int chosen, int index, int[][] dp) {
            if (index == arr.length)
                return 0;

            if (chosen != -1 && dp[index][chosen] != 0)
                return dp[index][chosen];

            int max = 0;
            for (int i = 0; i <= 2; i++) {
                if (chosen == i) continue;
                max = Math.max(max, arr[index][i] + maxPoints(arr, i, index + 1, dp));
            }

            if(chosen != -1)
                dp[index][chosen] = max;
            return max;
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

