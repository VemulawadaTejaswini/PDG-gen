import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] arr = new char[h][w];
    int[][] d = new int[h][w];
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    boolean[][] flag = new boolean[h][w];
    Queue<Pair> queue = new ArrayDeque<>();

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        for (int i=0; i<h; i++) {
            arr[i] = sc.next().toCharArray();
        }

//        for (int i=0; i<h; i++) {
//            for (int j=0; j<w; j++) {
//                d[i][j] = Integer.MAX_VALUE;
//            }
//        }

        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                if (arr[i][j] == '#') {
//                    d[i][j] = 0;
                    queue.add(new Pair(i, j));
                }
            }
        }

        bfs();

        int cnt = 0;
        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
//                if (arr[i][j] == '#') continue;
                cnt = Math.max(cnt, d[i][j]);
//                System.out.println(d[i][j]);
            }
        }

        System.out.println(cnt);

    }

    void bfs() {
        while (!queue.isEmpty()) {
//            Pair pair = queue.peek();
            Pair pair = queue.remove();
            int y = pair.y;
            int x = pair.x;
            flag[y][x] = true;
            for (int i=0; i<4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (ny<0 || h<=ny || nx<0 || w<=nx) continue;
//                if (arr[ny][nx] == '#') continue;
                if (flag[ny][nx]) continue;
                d[ny][nx] = d[y][x] + 1;
                queue.add(new Pair(ny, nx));
                flag[ny][nx] = true;
            }
//            queue.poll();
        }
    }

    class Pair {
        int y, x;

        public Pair(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }



}
