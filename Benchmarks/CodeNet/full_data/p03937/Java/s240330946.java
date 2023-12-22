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
        int[] dx = new int[]{0, 1};
        int[] dy = new int[]{1, 0};

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();

            char grid[][] = new char[N][M];
            for (int i = 0; i < N; i++) {
                grid[i] = in.next().toCharArray();
            }

            boolean used[][] = new boolean[N][M];

            int cx = 0;
            int cy = 0;
            used[cx][cy] = true;
            boolean found = true;
            while (found) {
                found = false;
                for (int d = 0; d < 2; d++) {
                    int nx = cx + dx[d];
                    int ny = cy + dy[d];

                    if (nx < 0 || nx >= N || ny < 0 || ny >= M || grid[nx][ny] == '.') {
                        continue;
                    }
                    found = true;
                    cx = nx;
                    cy = ny;
                    used[cx][cy] = true;
                    break;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (grid[i][j] == '#' && !used[i][j]) {
                        out.println("Impossible");
                        return;
                    }
                }
            }

            out.println("Possible");
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
