import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {

    private static final int MAX = 51;
    private static final int INF = 1000000;
    
    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h, w;
        h = scanner.nextInt();
        w = scanner.nextInt();

        String[] s = new String[h];
        for (int i = 0; i < h; i++) {
            s[i] = scanner.next();
        }
        
        int[][] dist = new int[h][w];
        bfs(dist, s);
        if (dist[h - 1][w - 1] == INF) {
            System.out.println(-1);
            System.exit(0);
        }

        int[] count = new int[h * w + 1];
        int infCount = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (dist[i][j] == INF) {
                    infCount++;
                } else {
                    count[dist[i][j]]++;
                }
            }
        }
        int blackCount = countBlackGrid(s);
        int answer = infCount - blackCount;
        for (int i = 1; i <= h * w; i++) {
            if (i > dist[h - 1][w - 1]) {
                answer += count[i];
            } else {
                answer += count[i] - 1;
            }
        }
        System.out.println(answer);
    }

    private static void bfs(int[][] dist, String[] s) {
        Queue<Pair> queue = new ArrayDeque<Pair>();
        int h = dist.length;
        int w = dist[0].length;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                dist[i][j] = INF;
            }
        }
        queue.add(new Pair(0, 0));
        dist[0][0] = 0;
        
        while (!queue.isEmpty()) {
            Pair p = queue.remove();
            for (int i = 0; i < 4; i++) {
                int nextX = p.getFirst() + dx[i];
                int nextY = p.getSecond() + dy[i];
                if (isInGrid(nextX, nextY, h, w) && s[nextX].charAt(nextY) == '.' && dist[nextX][nextY] == INF) {
                    queue.add(new Pair(nextX, nextY));
                    dist[nextX][nextY] = dist[p.getFirst()][p.getSecond()] + 1;
                }
            }
        }
    }

    private static boolean isInGrid(int x, int y, int h, int w) {
        return 0 <= x && x < h && 0 <= y && y < w;
    }

    private static int countBlackGrid(String[] s) {
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) == '#') {
                    count++;
                }
            }
        }
        return count;
    }
}

class Pair {
    private final int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return this.first;
    }

    public int getSecond() {
        return this.second;
    }
}
