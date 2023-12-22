import java.util.*;

public class Main {
  private static int INF = 1_000_000_000;
  private static int H;
  private static int W;
  private static int[][] d;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    W = sc.nextInt();
    d = new int[H][W];
    int black = 0;
    for (int i = 0; i < H; i++) {
      String s = sc.next();
      for (int j = 0; j < W; j++) {
        if (s.charAt(j) == '.') {
          d[i][j] = INF;
        } else {
          d[i][j] = -1;
          black++;
        }
      }
    }
    LinkedList<Point> q = new LinkedList<>();
    q.offer(new Point(0, 0));
    d[0][0] = 0;
    while (!q.isEmpty()) {
      Point p = q.poll();
      for (int v = 0; v < 4; v++) {
        int ii = p.i+dy[v];
        int jj = p.j+dx[v];
        if (0 <= ii && ii < H
            && 0 <= jj && jj < W
            && d[ii][jj] != -1
            && d[ii][jj] > d[p.i][p.j]+1) {
          d[ii][jj] = d[p.i][p.j]+1;
          q.offer(new Point(ii, jj));
        }
      }
    }
    int ans = d[H-1][W-1] == INF ? -1 : H*W-black-d[H-1][W-1]-1;
    System.out.println(ans);
  }
  
  private static class Point {
    final int i;
    final int j;
    Point(int i , int j) {
      this.i = i;
      this.j = j;
    }
  }
  
  private static int[] dx = { 0, 0, 1, -1 };
  private static int[] dy = { 1, -1, 0, 0};
}