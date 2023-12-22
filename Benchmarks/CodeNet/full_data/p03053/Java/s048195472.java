import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] a = new String[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().split("");
        }
        Deque<Point> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if ("#".equals(a[i][j])) {
                    visited[i][j] = true;
                    queue.add(new Point(i, j));
                }
            }
        }
        int cnt = -1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            cnt++;
            for (int i = 0; i < size; i++) {
                Point p = queue.poll();
                final int[][] DXDY = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
                for (int j = 0; j < DXDY.length; j++) {
                    int x = p.x + DXDY[j][0];
                    int y = p.y + DXDY[j][1];
                    if (x < 0 || x >= h || y < 0 || y >= w || visited[x][y]) {
                        continue;
                    }
                    visited[x][y] = true;
                    queue.add(new Point(x, y));
                }
            }
        }
        System.out.println(cnt);
    }
}
