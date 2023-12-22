import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayDeque;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ADarkerAndDarker solver = new ADarkerAndDarker();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADarkerAndDarker {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int INF = (int) 1e9;
            int[] dx = {-1, 0, 0, 1};
            int[] dy = {0, -1, 1, 0};

            int h = in.nextInt();
            int w = in.nextInt();

            char[][] c = new char[h][w];
            for (int i = 0; i < h; i++) {
                c[i] = in.next().toCharArray();
            }
            int[][] man = new int[h + 1][w + 1];
            boolean[][] used = new boolean[h + 1][w + 1];

            for (int i = 0; i <= h; i++) {
                Arrays.fill(man[i], INF);
                Arrays.fill(used[i], false);
            }
            ArrayDeque<Integer> q = new ArrayDeque<>();


            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    // 多点bfs
                    if (c[i][j] == '#') {
                        q.addLast(i * w + j);
                        used[i][j] = true;
                        man[i][j] = 0;
                    }
                }
            }

            while (!q.isEmpty()) {
                //out.println("q:" + q.peek());
                int now = q.pollFirst();
                for (int i = 0; i < 4; i++) {
                    int x = now / w;
                    int y = now % w;
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (!(0 <= nx && nx < h && 0 <= ny && ny < w)) continue;
                    if (!used[nx][ny]) {
                        used[nx][ny] = true;
                        man[nx][ny] = man[x][y] + 1;
                        q.addLast(nx * w + ny);
                    }
                }
            }

            int max = -1;
            for (int i = 0; i < h; i++) {
                // out.println(Arrays.toString(man[i]));
                for (int j = 0; j < w; j++) {
                    if (c[i][j] == '.') max = Math.max(max, man[i][j]);
                }
            }

            out.println(max);

        }

    }
}

