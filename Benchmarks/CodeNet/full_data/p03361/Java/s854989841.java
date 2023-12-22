import java.util.*;

public class Main {
  static int h;
  static int w;
  static int[][] canvas;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    h = Integer.parseInt(sc.next());
    w = Integer.parseInt(sc.next());
    String str = "";
    canvas = new int[h][w];
    for(int i = 0; i < h; i++) {
      str = sc.next();
      for(int j = 0; j < w; j++) {
        canvas[i][j] = (str.charAt(j) == '#')? 1 : 0;
      }
    }
    boolean flag = true;;
    int startX = 0, startY = 0;
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        if(canvas[i][j] == 1) {
          startX = i;
          startY = j;
        }
      }
    }
    dfs(startX, startY);
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        if(canvas[i][j] == 1) flag = false;
      }
    }
    System.out.println((flag)? "Yes" : "No");
  }

  static void dfs(int x, int y) {
    canvas[x][y] = 0;
    if(0 < x && canvas[x-1][y] == 1) dfs(x - 1, y);
    if(x < h - 1 && canvas[x+1][y] == 1) dfs(x + 1, y);
    if(0 < y && canvas[x][y-1] == 1) dfs(x, y - 1);
    if(y < w - 1 && canvas[x][y+1] == 1) dfs(x, y + 1);
    return;
  }
}
