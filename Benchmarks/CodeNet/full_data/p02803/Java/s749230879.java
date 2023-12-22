import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        MazeMaster solver = new MazeMaster();
        solver.solve(1, in, out);
        out.close();
    }

    static class MazeMaster {
        int[][] map;
        int h;
        int w;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();

            map = new int[h][w];

            for (int i = 0; i < h; i++) {
                String s = in.next();
                char[] chars = s.toCharArray();
                for (int j = 0; j < w; j++) {
                    if (chars[j] == '.') {
                        map[i][j] = 1;
                    }
                }
            }
            int result = 0;
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    int[] d = dijkstra(i, j, map);
                    for (int k = 0; k < d.length; k++) {
                        int x = k % w;
                        int y = k / w;
                        if (map[y][x] == 1) {
                            result = Math.max(result, d[k]);
                        }
                    }
                }
            }

            out.println(result);
        }

        int[] dijkstra(int x, int y, int[][] map) {
            if (map[y][x] == 0) {
                return new int[0];
            }

            MazeMaster.Color[] colors = new MazeMaster.Color[h * w];
            int[] distance = new int[h * w];

            Arrays.fill(colors, MazeMaster.Color.WHITE);
            Arrays.fill(distance, Integer.MAX_VALUE);

            distance[y * w + x] = 0;
            colors[y * w + x] = MazeMaster.Color.GRAY;

            Queue<Pair> pq = new ArrayDeque<>();
            pq.add(new Pair(x, y));

            int[] nx = {-1, 1, 0, 0};
            int[] ny = {0, 0, -1, 1};

            while (!pq.isEmpty()) {
                Pair p = pq.poll();
                colors[p.y * w + p.x] = MazeMaster.Color.BLACK;
                for (int i = 0; i < nx.length; i++) {
                    int xx = p.x + nx[i];
                    int yy = p.y + ny[i];
                    if (canMove(xx, yy, map, colors)) {
                        if (distance[yy * w + xx] > distance[p.y * w + p.x] + map[yy][xx]) {
                            distance[yy * w + xx] = distance[p.y * w + p.x] + map[yy][xx];
                            colors[yy * w + xx] = MazeMaster.Color.GRAY;
                            pq.add(new Pair(xx, yy));
                        }
                    }
                }
            }
            return distance;
        }

        public boolean canMove(int x, int y, int[][] map, MazeMaster.Color[] colors) {

            if (!isInside(x, y, map) || map[y][x] == 0) {
                return false;
            }
            return colors[y * w + x] == MazeMaster.Color.WHITE;
        }

        public boolean isInside(int x, int y, int[][] map) {
            int h = map.length;
            if (h <= 0) {
                return false;
            }
            int w = map[0].length;
            if (w <= 0) {
                return false;
            }

            if (x < 0 || y < 0) {
                return false;
            }
            return h > y && w > x;
        }

        public enum Color {
            WHITE,
            GRAY,
            BLACK,
            ;
        }

        class Pair {
            public final Integer x;
            public final Integer y;

            public Pair(Integer x, Integer y) {
                this.x = x;
                this.y = y;
            }

        }

    }
}

