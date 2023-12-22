import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        final int[] dx = new int[]{1, 0, 0, -1};
        final int[] dy = new int[]{0, 1, -1, 0};

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();
            char[][] S = new char[H][];
            for (int i = 0; i < H; i++) {
                S[i] = in.next().toCharArray();
            }
            boolean[][] vis = new boolean[H][W];
            Queue<Pair<Integer, Integer>> que = new ArrayDeque<>();
            que.add(Pair.MakePair(0, 0));
            while (!que.isEmpty()) {
                Pair<Integer, Integer> now = que.poll();
                if (vis[now.first][now.second]) {
                    continue;
                }
                vis[now.first][now.second] = true;
                for (int d = 0; d < 4; d++) {
                    int nx = now.first + dx[d];
                    int ny = now.second + dy[d];
                    if (0 <= nx && nx < H && 0 <= ny && ny < W) {
                        que.add(Pair.MakePair(nx, ny));
                    }
                }
            }
            if (vis[H - 1][W - 1]) {
                int cnt = 0;
                for (int i = 0; i < H; i++) {
                    for (int j = 0; j < W; j++) {
                        if (S[i][j] == '#') {
                            cnt++;
                        }
                    }
                }
                out.println(H * W - cnt - (H + W - 1));
            } else {
                out.println(-1);
            }
        }

    }

    static class Pair<T1, T2> {
        public T1 first;
        public T2 second;

        public Pair(T1 f, T2 s) {
            this.first = f;
            this.second = s;
        }

        public static <T1, T2> Pair MakePair(T1 f, T2 s) {
            return new Pair<T1, T2>(f, s);
        }

    }
}

