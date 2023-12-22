import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int h = sc.nextInt(), w = sc.nextInt();
        boolean[][] s = new boolean[h][w];
        int[][] d = new int[h][w];
        int countInitialBlack = 0;
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                s[i][j] = str.charAt(j) == '.';
                d[i][j] = -1;
                if (!s[i][j]) {
                    countInitialBlack++;
                }
            }
        }

        Queue<Point> queue = new LinkedList<>();
        Point start = new Point(0, 0);
        Point goal = new Point(h - 1, w - 1);
        int tmpX, tmpY;

        queue.offer(start);
        d[start.y][start.x] = 0;
        int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};

        while (queue.size() > 0) {
            Point p = queue.poll();
            if (p.y == goal.y && p.x == goal.x) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                tmpY = p.y + dy[i];
                tmpX = p.x + dx[i];

                if (0 <= tmpY && tmpY < h && 0 <= tmpX && tmpX < w
                    && s[tmpY][tmpX] && d[tmpY][tmpX] == -1) {
                    queue.offer(new Point(tmpY, tmpX));
                    d[tmpY][tmpX] = d[p.y][p.x] + 1;
                }
            }
        }

        int minWhiteCell = d[h - 1][w - 1] + 1;
        System.out.println(h * w - countInitialBlack - minWhiteCell);
    }
}

class Point {

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    int y, x;
}