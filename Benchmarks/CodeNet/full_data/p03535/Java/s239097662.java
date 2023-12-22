import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TimeGap solver = new TimeGap();
        solver.solve(1, in, out);
        out.close();
    }

    static class TimeGap {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int ans = 0;

            int N = in.nextInt();
            int[] D = new int[N];
            for (int i = 0; i < N; i++) D[i] = in.nextInt();

            int[][] mimx = new int[N][2];
            for (int i = 0; i < N; i++) mimx[i] = new int[]{Math.min(D[i], 24 - D[i]), Math.max(D[i], 24 - D[i])};


            for (int a = 0; a <= 1; a++) {
                for (int b = 0; b <= 1; b++) {
                    int mini = Integer.MAX_VALUE;
                    for (int i = 0; i < N; i++) {
                        for (int j = i + 1; j < N; j++) {
                            mini = Math.min(mini, Math.abs(mimx[i][a] - mimx[j][b]));
                        }
                    }
                    ans = Math.max(ans, mini);
                }
            }
            out.println(ans == Integer.MAX_VALUE ? 0 : ans);
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

