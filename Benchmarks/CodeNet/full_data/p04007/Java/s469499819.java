import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.LinkedList;
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
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();

            char[][] all = new char[H][W];
            char[][] purple = new char[H][W];
            for (int i = 0; i < H; i++) {
                purple[i] = in.next().toCharArray();
            }
            char[][] red = new char[H][W];

            char[][] blue = new char[H][W];

            Queue<Wez> q = new LinkedList<>();
            all[0][0] = 'R';
            all[H - 1][W - 1] = 'B';
            q.add(new Wez('R', 0, 0, 0));
            q.add(new Wez('B', H - 1, W - 1, 2));
            while (!q.isEmpty()) {
                Wez w = q.poll();
                int nx = w.x + dx[w.kierunek];
                int ny = w.y + dy[w.kierunek];

                if (nx >= 0 && nx < H && ny >= 0 && ny < W && all[nx][ny] == 0) {
                    all[nx][ny] = w.color;
                    q.add(new Wez(w.color, nx, ny, w.kierunek));
                } else {
                    w.kierunek = (w.kierunek + 1) % 4;
                    nx = w.x + dx[w.kierunek];
                    ny = w.y + dy[w.kierunek];
                    if (nx >= 0 && nx < H && ny >= 0 && ny < W && all[nx][ny] == 0) {
                        all[nx][ny] = w.color;
                        q.add(new Wez(w.color, nx, ny, w.kierunek));
                    }
                }
            }


            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    blue[i][j] = red[i][j] = '.';
                    if (all[i][j] == 'B') {
                        blue[i][j] = '#';
                    } else if (all[i][j] == 'R') {
                        red[i][j] = '#';
                    }
                    if (purple[i][j] == '#') {
                        blue[i][j] = red[i][j] = '#';
                    }
                }
            }
            for (int i = 0; i < H; i++) {
                out.println(new String(red[i]));
            }
            out.println();
            for (int i = 0; i < H; i++) {
                out.println(new String(blue[i]));
            }


        }

        private static class Wez {
            private char color;
            private int x;
            private int y;
            private int kierunek;

            public Wez(char color, int x, int y, int kierunek) {
                this.color = color;
                this.x = x;
                this.y = y;
                this.kierunek = kierunek;
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
