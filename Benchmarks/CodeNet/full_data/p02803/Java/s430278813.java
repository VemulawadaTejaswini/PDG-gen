import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] arr = new char[h][w];
    int max = 0;
    int[][] d = new int[h][w];
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        for (int i=0; i<h; i++) arr[i] = sc.next().toCharArray();

        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                if (arr[i][j] == '.') {
                    for (int a=0; a<h; a++) {
                        Arrays.fill(d[a], Integer.MAX_VALUE);
                    }
                    d[i][j] = 0;
                    bfs(new Pair(i, j));
                    int tMax = 0;
                    for (int a=0; a<h; a++) {
                        for (int b=0; b<w; b++) {
                            if (d[a][b] != Integer.MAX_VALUE) tMax = Math.max(tMax, d[a][b]);
                        }
                    }
                    max = Math.max(max, tMax);
                }
            }
        }

        System.out.println(max);

    }

    void bfs(Pair pair) {
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(pair);
        while (!queue.isEmpty()) {
            Pair p = queue.peek();
            int x = p.x;
            int y = p.y;
            for (int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || h <= nx || ny < 0 || w <= ny) continue;
                if (arr[nx][ny] == '#') continue;
                if (d[nx][ny] > d[x][y] + 1) {
                    d[nx][ny] = d[x][y] + 1;
                    queue.add(new Pair(nx, ny));
                }
            }
            queue.poll();
        }
    }

    class Pair {
        int x;
        int y;
        public Pair(int x , int y) {
            this.x = x;
            this.y = y;
        }
    }

}
