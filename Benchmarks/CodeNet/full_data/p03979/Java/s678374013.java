import java.util.*;

class E {
    static final int[] dx = {-1, 1, 0, 0};
    static final int[] dy = {0, 0, -1, 1};

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final char[][] map = new char[H][];
        for (int i = 0; i < map.length; i++)
            map[i] = sc.next().toCharArray();
        int minx = W - 1;
        int maxx = 0;
        int miny = H - 1;
        int maxy = 0;
        for (int x = 0; x < W; x++)
            for (int y = 0; y < H; y++)
                if (map[y][x] == 'X') {
                    minx = Math.min(minx, x);
                    maxx = Math.max(maxx, x);
                    miny = Math.min(miny, y);
                    maxy = Math.max(maxy, y);
                }
        if (minx <= 0 || W - 1 <= maxx || miny <= 0 || H - 1 <= maxy) {
            System.out.println(-1);
        } else {
            int ans = 0;
            for (int x = 1; x < W - 1; x++)
                for (int y = 1; y < H - 1; y++)
                    if (map[y][x] == 'X')
                        map[y - 1][x] = map[y + 1][x] = map[y][x - 1] = map[y][x + 1] = '#';
            for (int x = 0; x < W; x++) {
                if (map[0][x] == '.')
                    dfs(map, x, 0, H, W);
                if (map[H - 1][x] == '.')
                    dfs(map, x, H - 1, H, W);
            }
            for (int y = 1; y < H - 1; y++) {
                if (map[y][0] == '.')
                    dfs(map, 0, y, H, W);
                if (map[y][W - 1] == '.')
                    dfs(map, W - 1, y, H, W);
            }
            for (int x = 0; x < W; x++)
                for (int y = 0; y < H; y++)
                    if (map[y][x] == '#') {
                        boolean b = false;
                        for (int d = 0; d < 4; d++)
                            if (0 <= x + dx[d] && x + dx[d] < W && 0 <= y + dy[d] && y + dy[d] < H)
                                if (map[y + dy[d]][x + dx[d]] == '@')
                                    b = true;
                        if (b)
                            ans++;
                    }
            System.out.println(ans);
        }
    }

    static void dfs(char[][] map, int x, int y, int H, int W) {
        for (int d = 0; d < 4; d++)
            if (0 <= x + dx[d] && x + dx[d] < W && 0 <= y + dy[d] && y + dy[d] < H)
                if (map[y + dy[d]][x + dx[d]] == '.') {
                    map[y + dy[d]][x + dx[d]] = '@';
                    dfs(map, x + dx[d], y + dy[d], H, W);
                }
    }
}
public class Main {
    public static void main(String... args) {
        E.main();
    }
}