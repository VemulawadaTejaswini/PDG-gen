import java.awt.*;
import java.util.*;

public class Main implements Runnable {

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();

    }

    @Override
    public void run() {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        boolean[][] meiro = new boolean[h][];
        Queue<Point> queue = new ArrayDeque<>();

        for (int i = 0; i < h; i++) {
            String[] s = sc.next().split("");
            boolean[] row = new boolean[w];
            for (int j = 0; j < w; j++) {
                if (s[j].equals("#")) {
                    row[j] = true;
                    queue.add(new Point(i, j));
                }
            }
            meiro[i] = row;
        }

        // 上下左右（分岐先）の座標を配列に入れておくと、forループで回して処理できるので便利
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        int[][] searched = new int[h][w];
        int ans = 0;
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            ans = searched[p.y][p.x];
            for (int k = 0; k < 4; k++) {
                int x = p.x + dx[k];
                int y = p.y + dy[k];
                // 分岐先の座標が、2つのif文の条件を満たすなら追加
                if (x >= 0 && x < w && y >= 0 && y < h) {
                    if (!meiro[y][x]) {
                        searched[y][x] = searched[p.y][p.x] + 1;
                        meiro[y][x] = true;
                        queue.add(new Point(x, y));
                    }
                }
            }
        }

        System.out.println(ans);
    }
}