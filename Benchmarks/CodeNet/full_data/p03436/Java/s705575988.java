import java.util.*;

class Main {

  static int d[][];
  static char map[][];
  static int x4[] = {0, 1, 0, -1};
  static int y4[] = {1, 0, -1, 0};
  static int H, W;
  static int count = 0;
  static class Point{
    int x, y;
    Point(int a, int b) {
      this.x = a;
      this.y = b;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    H = sc.nextInt();
    W = sc.nextInt();
    d = new int[H][W];
    map = new char[H][W];
    for (int i = 0; i < H; i++) {
      String s = sc.next();
      for (int j = 0; j < W; j++) {
        map[i][j] = s.charAt(j);
        if (map[i][j] == '#')
          count++;
        if (i != 0 || j != 0)
          d[i][j] = -1;
      }
    }

    ArrayDeque<Point> q = new ArrayDeque<>();
    q.addFirst(new Point(0, 0));

    while (!q.isEmpty()) {
      Point p = q.removeFirst();
      for (int i = 0; i < 4; i++) {
        int nx = p.x + x4[i];
        int ny = p.y + y4[i];
        if (nx >= 0 && ny >= 0 && nx < W && ny < H) {
          if (map[ny][nx] == '.' && d[ny][nx] == -1) {
            d[ny][nx] = d[p.y][p.x] + 1;
            q.addLast(new Point(nx, ny));
          }
        }
      }
    }
    /*
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (d[i][j] == -1)
          System.out.print("   ");
        else
          System.out.printf("%3d", d[i][j]);
      }
      System.out.println();
    }
    */
    System.out.println(H*W-(count+d[H-1][W-1]+1));
  }
}
