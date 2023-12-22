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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int height = in.nextInt();
            int width = in.nextInt();
            int numQueries = in.nextInt();
            String[] field = new String[height];
            for (int r = 0; r < height; ++r) field[r] = in.next();
            int[][] dist = new int[height][width];
            int[] qr = new int[height * width];
            int[] qc = new int[height * width];
            int[][] sums = new int[height + 1][width + 1];
            for (int sr = 0; sr < height; ++sr) {
                for (int sc = 0; sc < width; ++sc) {
                    if (field[sr].charAt(sc) == '1' && dist[sr][sc] == 0) {
                        dist[sr][sc] = 1;
                        sums[sr + 1][sc + 1] += 1;
                        qr[0] = sr;
                        qc[0] = sc;
                        int qt = 0;
                        int qh = 1;
                        while (qt < qh) {
                            int r = qr[qt];
                            int c = qc[qt];
                            ++qt;
                            for (int dr = -1; dr <= 1; ++dr) {
                                for (int dc = -1; dc <= 1; ++dc) {
                                    if (Math.abs(dr) + Math.abs(dc) == 1) {
                                        int nr = r + dr;
                                        int nc = c + dc;
                                        if (nr >= 0 && nr < height && nc >= 0 && nc < width && field[nr].charAt(nc) == '1' && dist[nr][nc] == 0) {
                                            dist[nr][nc] = dist[r][c] + 1;
                                            qr[qh] = nr;
                                            qc[qh] = nc;
                                            ++qh;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int sr = 1; sr <= height; ++sr) {
                for (int sc = 1; sc <= width; ++sc) {
                    sums[sr][sc] += sums[sr - 1][sc] + sums[sr][sc - 1] - sums[sr - 1][sc - 1];
                }
            }
            for (int qi = 0; qi < numQueries; ++qi) {
                int r1 = in.nextInt() - 1;
                int c1 = in.nextInt() - 1;
                int r2 = in.nextInt();
                int c2 = in.nextInt();
                int res = sums[r2][c2] - sums[r1][c2] - sums[r2][c1] + sums[r1][c1];
                if (r1 > 0) {
                    for (int c = c1; c < c2; ++c) {
                        int d1 = dist[r1][c];
                        int d2 = dist[r1 - 1][c];
                        if (d2 > 0 && d1 > d2) {
                            ++res;
                        }
                    }
                }
                if (r2 < height) {
                    for (int c = c1; c < c2; ++c) {
                        int d1 = dist[r2 - 1][c];
                        int d2 = dist[r2][c];
                        if (d2 > 0 && d1 > d2) {
                            ++res;
                        }
                    }
                }
                if (c1 > 0) {
                    for (int r = r1; r < r2; ++r) {
                        int d1 = dist[r][c1];
                        int d2 = dist[r][c1 - 1];
                        if (d2 > 0 && d1 > d2) {
                            ++res;
                        }
                    }
                }
                if (c2 < width) {
                    for (int r = r1; r < r2; ++r) {
                        int d1 = dist[r][c2 - 1];
                        int d2 = dist[r][c2];
                        if (d2 > 0 && d1 > d2) {
                            ++res;
                        }
                    }
                }
                out.println(res);
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

