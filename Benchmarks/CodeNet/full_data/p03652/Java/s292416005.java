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
 *
 * @author HossamDoma
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {


            int n = in.nextInt();
            int m = in.nextInt();

            int[][] a = new int[n][m];

            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    a[i][j] = in.nextInt();
                }
            }

            int bst = m;

            int[] nxt = new int[n];
            boolean[] used = new boolean[n];

            int[] sports = new int[m + 1];
            boolean[] blocked = new boolean[m + 1];

            for (int j = 0; j < m; ++j) {

                int mx_sport = 0;

                for (int i = 0; i < n; ++i) {
                    if (used[i]) continue;
                    int x = nxt[i];
                    while (x < m && blocked[a[i][x]]) x++;
                    if (x >= m) break;
                    nxt[i] = x;
                    mx_sport = Math.max(++sports[a[i][nxt[i]]], mx_sport);
                    used[i] = true;
                }

                for (int i = 0; i < n; ++i) {
                    if (sports[a[i][nxt[i]]] == mx_sport) {
                        blocked[a[i][nxt[i]]] = true;
                        used[i] = false;
                    }

                }

                bst = Math.min(mx_sport, bst);
            }

            out.println(bst);
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

