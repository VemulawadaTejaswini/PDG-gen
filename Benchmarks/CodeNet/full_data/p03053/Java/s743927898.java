import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] map = new int[h][w];
        ArrayDeque<Point> que = new ArrayDeque<>();

        for (int i=0; i<h; i++) {
            char[] c = sc.next().toCharArray();
            for (int j=0; j<w; j++) {
                if (c[j] == '.') {
                    map[i][j] = Integer.MAX_VALUE;
                } else if (c[j] == '#'){
                    map[i][j] = 0;
                    que.addFirst(new Point(i,j));
                }
            }
        }
        int[] dh = {1,-1,0,0};
        int[] dw = {0,0,1,-1};
        while (que.size() > 0) {
            Point p = que.removeFirst();
            for (int i=0; i<4; i++) {
                int nh = p.h + dh[i];
                int nw = p.w + dw[i];
                if (nh < 0 || nh >= h) continue;
                if (nw < 0 || nw >= w) continue;
                if (map[nh][nw] == Integer.MAX_VALUE) {
                    que.addLast(new Point(nh, nw));
                    map[nh][nw] = map[p.h][p.w] + 1;
                }
            }
        }
        int max = 0;
        for (int[] array : map) {
            for (int a : array) {
                max = Math.max(max, a);
            }
        }
        System.out.println(max);

    }
    static class Point {
        int h;
        int w;
        Point (int h, int w) {
            this.h = h;
            this.w = w;
        }
    }
}