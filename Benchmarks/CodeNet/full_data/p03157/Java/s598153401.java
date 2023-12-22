import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] m = new char[H][W];
    for (int i = 0; i < H; i++) {
      String s = sc.next();
      for (int j = 0; j < W; j++) {
        m[i][j] = s.charAt(j);
      }
    }
    
    int[][] color = new int[H][W];
    int nowColor = 0;
    for (int s = 0; s < H*W; s++) {
      int si = s/W;
      int sj = s%W;
      if (color[si][sj] > 0) continue;
      nowColor++;
      LinkedList<Point> q = new LinkedList<>();
      q.offer(new Point(si,sj));
      color[si][sj] = nowColor;
      while (!q.isEmpty()) {
        Point p = q.poll();
        for (int d = 0; d < 4; d++) {
          int i = p.i+di[d];
          int j = p.j+dj[d];
          if (0 <= i && i < H
             && 0 <= j && j < W
             && color[i][j] == 0) {
            if (m[p.i][p.j] != m[i][j]) {
              color[i][j] = nowColor;
              //System.out.println(si+","+sj+" "+i+","+j);
              q.add(new Point(i,j));
            }
          }
        }
      }
    }
 
    int[] black = new int[H*W+1];
    int[] white = new int[H*W+1];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (m[i][j] == '#') {
          black[color[i][j]]++;
        } else {
          white[color[i][j]]++;
        }
      }
    }
      
    long ans = 0;
    for (int i = 0; i < H*W+1; i++) {
      ans += (long)white[i]*black[i];
    }
    System.out.println(ans);
  }
  private static int[] di = {0,0,1,-1};
  private static int[] dj = {1,-1,0,0};
  private static class Point {
    private final int i;
    private final int j;
    Point(int i, int j) {
      this.i = i;
      this.j = j;
    }
  }
}