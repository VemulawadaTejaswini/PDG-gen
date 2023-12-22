import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] s = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                s[i][j] = str.charAt(j);
            }
        }
        int ans = 0;
        int dy[] = {1, -1, 0, 0};
        int dx[] = {0, 0, 1, -1};
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j] == '#') continue;
                int[][] maze = new int[h][w];
                for (int k = 0; k < h; k++) {
                    for (int l = 0; l < w; l++) {
                        maze[k][l] = -1;
                    }
                }
                maze[i][j] = 0;
                Queue<Point> q = new ArrayDeque<>();
                q.add(new Point(i, j));
                while (q.size() > 0) {
                    Point p = q.poll();
                    int y = p.first, x = p.second;
                    for (int k = 0; k < 4; k++) {
                        int ny = y + dy[k], nx = x + dx[k];
                        if (0 <= ny && ny < h && 0 <= nx && nx < w && s[ny][nx] == '.' && maze[ny][nx] == -1) {
                            maze[ny][nx] = maze[y][x] + 1;
                            q.add(new Point(ny, nx));
                        }
                    }
                }
                int ma = 0;
                for (int k = 0; k < h; k++) {
                    for (int l = 0; l < w; l++) {
                        ma = Math.max(ma, maze[k][l]);
                    }
                }
                ans = Math.max(ans, ma);
            }
        }
        System.out.println(ans);
    }
}

class Point {
    public int first, second;
    Point(int y, int x) {
        this.first = y;
        this.second = x;
    }
}