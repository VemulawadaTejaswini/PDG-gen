import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] grid;
    static int h, w;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[][] dist;

    public static void main(String[] args) {
        h = sc.nextInt();
        w = sc.nextInt();
        grid = new String[h];
        for(int y = 0; y < h; ++y) grid[y] = sc.next();
        dist = new int[h][w];

        bfs(0, 0);
        if(dist[h - 1][w - 1] < 0) {
            System.out.println(-1);
            return;
        }
        
        int white = countWhiteGrid();
        int passedWhite = dist[h - 1][w - 1] + 1;
        int ans = white - passedWhite;
        System.out.println(ans);
    }
    
    static int countWhiteGrid() {
        int white = 0;
        for(int y = 0; y < h; ++y) {
            for(int x = 0; x < w; ++x) {
                if(grid[y].charAt(x) == '.') ++white;
            }
        }
        return white;
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
                if(isOutOfMaze(ny, nx) || grid[ny].charAt(nx) != '.' || dist[ny][nx] >= 0) continue;
                dist[ny][nx] = dist[fc.y][fc.x] + 1;
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