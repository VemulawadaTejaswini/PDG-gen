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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        private int height;
        private int width;
        private String[] field;
        private int[][] dist;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            height = in.nextInt();
            width = in.nextInt();
            field = new String[height];
            for (int row = 0; row < height; ++row) {
                field[row] = in.next();
            }
            dist = new int[height][width];
            int[] qr = new int[height * width];
            int[] qc = new int[height * width];
            int qt = 0;
            int qh = 0;
            for (int row = 0; row < height; ++row) {
                for (int col = 0; col < width; ++col) {
                    if (field[row].charAt(col) == '#') {
                        dist[row][col] = 0;
                        qr[qh] = row;
                        qc[qh] = col;
                        ++qh;
                    } else {
                        dist[row][col] = (int) 1e9;
                    }
                }
            }
            while (qt < qh) {
                int r = qr[qt];
                int c = qc[qt];
                ++qt;
                for (int dr = -1; dr <= 1; ++dr) {
                    for (int dc = -1; dc <= 1; ++dc) {
                        if (Math.abs(dr) + Math.abs(dc) == 1) {
                            int nr = r + dr;
                            int nc = c + dc;
                            if (nr >= 0 && nr < height && nc >= 0 && nc < width && dist[nr][nc] > 1 + dist[r][c]) {
                                dist[nr][nc] = 1 + dist[r][c];
                                qr[qh] = nr;
                                qc[qh] = nc;
                                ++qh;
                            }
                        }
                    }
                }
            }
            int res = 0;
            for (int[] x : dist) for (int y : x) res = Math.max(res, y);
            out.println(res);
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

