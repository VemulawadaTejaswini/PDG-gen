//package Round613;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author sguar <shugangcao@gmail.com>
 * welcome to kuaishou
 * Created on 2020-01-12
 */
public class Main {
    boolean maze[][];
    int xi[] = {-1, 1, 0, 0};
    int yi[] = {0, 0, -1, 1};
    int n, m;
    public void run() {
        Scanner cin = new Scanner(System.in);
        n =  cin.nextInt();
        m = cin.nextInt();
        cin.nextLine();
        maze = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String s = cin.nextLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == '.') {
                    maze[i][j] = true;
                }
                //System.out.print(maze[i][j]);
            }
            //System.out.println("");
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maze[i][j]) {
                    ans = Math.max(ans, solve(i, j));
                }
            }
        }
        System.out.println(ans);
    }

    public int solve(int x, int y) {

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y, 0));
        int ans = 0;
        boolean[][] vis = new boolean[n][m];
        vis[x][y] = true;
        while (!queue.isEmpty()) {
            Point p = queue.remove();
            ans = Math.max(ans, p.num);
            for (int i = 0; i <= 3; i++) {
                int nx = xi[i] + p.x;
                int ny = yi[i] + p.y;
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maze[nx][ny] && !vis[nx][ny]) {
                    vis[nx][ny] = true;
                    queue.add(new Point(nx, ny, p.num + 1));
                }
            }
        }
        return ans;
    }
    class Point {
        int x;
        int y;
        int num;
        public String toString() {
            return x + "," + y + "=" + num;
        }
        Point(int x, int y, int num) {
            this.x = x;
            this.y = y;
            this.num = num;
        }
    }

    public static void main(String[] args) {
       new Main().run();
    }
}

