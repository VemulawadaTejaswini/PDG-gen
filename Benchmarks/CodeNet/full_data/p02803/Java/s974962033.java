import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] s = null;
    static int h = 0, w = 0;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[][] dist = null;
    static int ans = 0;

    public static void main(String[] args) {
        h = sc.nextInt();
        w = sc.nextInt();
        s = new String[h];
        for(int y = 0; y < h; ++y) s[y] = sc.next();
        dist = new int[h][w];

        for(int y = 0; y < h; ++y) {
            for(int x = 0; x < w; ++x) {
                if(s[y].charAt(x) == '.') bfs(y, x);
            }
        }
        System.out.println(ans);
    }
    
    static void initializeDist(int sy, int sx) {
        for(int y = 0; y < h; ++y) {
            for(int x = 0; x < w; ++x) dist[y][x] = (y == sy && x == sx) ? 0 : -1;
        }
    }

    static void bfs(int sy, int sx) {
        initializeDist(sy, sx);
        ArrayDeque<Coordinate> coordinates = new ArrayDeque<>();
        coordinates.add(new Coordinate(sy, sx));

        while(coordinates.size() > 0) {
            Coordinate fc = coordinates.remove();
            for(int i = 0; i < 4; ++i) {
                int ny = fc.y + dy[i];
                int nx = fc.x + dx[i];
                if(isOutOfMaze(ny, nx) || s[ny].charAt(nx) != '.' || dist[ny][nx] >= 0) continue;
                dist[ny][nx] = dist[fc.y][fc.x] + 1;
                ans = Math.max(ans, dist[ny][nx]);
                coordinates.add(new Coordinate(ny, nx));
            }
        }
    }

    static boolean isOutOfMaze(int y, int x) {
        return y < 0 || h <= y || x < 0 || w <= x;
    }
}

class Coordinate {
    int y;
    int x;
    
    public Coordinate(int y, int x) {
        this.y = y;
        this.x = x;
    }
}