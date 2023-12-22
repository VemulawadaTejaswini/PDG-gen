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
 * @author Anirudh Rayabharam (mail@anirudhrb.com)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GridColoring solver = new GridColoring();
        solver.solve(1, in, out);
        out.close();
    }

    static class GridColoring {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[][] g = new int[h][w];
            int curI, curJ;
            curI = curJ = 0;
            boolean right = true;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < a[i - 1]; j++) {
                    g[curI][curJ] = i;
                    if (right) {
                        if (curJ + 1 == w) {
                            curI++;
                            right = false;
                        } else {
                            curJ++;
                        }
                    } else {
                        if (curJ - 1 < 0) {
                            curI++;
                            right = true;
                        } else {
                            curJ--;
                        }
                    }
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    out.print(g[i][j] + " ");
                }
                out.println();
            }
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

