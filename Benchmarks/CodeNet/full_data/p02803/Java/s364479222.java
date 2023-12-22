import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] s = new char[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
        }
        int ans = 0;
        final int[][] DXDY = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j] == '#') {
                    continue;
                }
                int depth = -1;
                Deque<Point> queue = new ArrayDeque<>();
                queue.add(new Point(i, j));
                boolean[][] visited = new boolean[h][w];
                visited[i][j] = true;
                while (!queue.isEmpty()) {
                    int size = queue.size();
                    depth++;
                    for (int k = 0; k < size; k++) {
                        Point p = queue.poll();
                        int posx = p.x;
                        int posy = p.y;
                        for (int l = 0; l < DXDY.length; l++) {
                            int x = posx + DXDY[l][0];
                            int y = posy + DXDY[l][1];
                            if (x < 0 || x >= h || y < 0 || y >= w || s[x][y] == '#' || visited[x][y]) {
                                continue;
                            }
                            visited[x][y] = true;
                            queue.add(new Point(x, y));
                        }
                    }
                }
                ans = Math.max(ans, depth);
            }
        }
        System.out.println(ans);
    }
}
