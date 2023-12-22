import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        List<Integer> xL = new ArrayList<>();
        List<Integer> yL = new ArrayList<>();
        char[][] map = new char[h][w];
        int cnt = 0;
        for (int i = 0; i < h; i++) {
            map[i] = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if (map[i][j] == '.') {
                    xL.add(j);
                    yL.add(i);
                } else {
                    cnt++;
                }
            }
        }
        if (cnt <= 2) {
            System.out.println(h - 1 + w - 1);
            return;
        }
        int ans = 0;
        for (int i = 0; i < xL.size(); i++) {
            Point start = new Point(xL.get(i), yL.get(i));
            for (int j = 0; j < xL.size(); j++) {
                Point goal = new Point(xL.get(j), yL.get(j));
                ans = Math.max(ans, bfs(start, goal, map.clone(), h, w));
            }
        }
        System.out.println(ans);
    }

    private static int bfs(Point start, Point goal, char[][] baseMap, int h, int w) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        Deque<Point> dq = new ArrayDeque<>();
        dq.add(start);
        char[][] map = deepCopy(baseMap);
        int[][] moves = new int[h][w];
        map[start.getY()][start.getX()] = '#';
        while (dq.size() > 0) {
            Point p = dq.removeFirst();
            for (int i = 0; i < 4; i++) {
                int x = p.getX() + dx[i];
                int y = p.getY() + dy[i];
                if (x < 0 || x > w - 1 || y < 0 || y > h - 1) {
                    continue;
                }
                if (map[y][x] == '.') {
                    dq.addLast(new Point(x, y));
                    map[y][x] = '#';
                    moves[y][x] = moves[p.getY()][p.getX()] + 1;
                }
            }
        }
        return moves[goal.getY()][goal.getX()];
    }

    private static char[][] deepCopy(char[][] org) {
        if (org == null) {
            return null;
        }

        final char[][] result = new char[org.length][];
        for (int i = 0; i < org.length; i++) {
            result[i] = Arrays.copyOf(org[i], org[i].length);
        }
        return result;
    }
}

class Point {

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}