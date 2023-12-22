import java.util.*;
import java.math.*;

public class Main {

  static int min = 10000;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();

    String[][] data = new String[h][w];

    for (int i = 0; i < h; i++) {
      String s = sc.next();
      for (int j = 0; j < w; j++) {
        data[i][j] = s.substring(j,j+1);
      }
    }

    int x = 0;
    int y = 0;

    int count = 0;

    dfs(data,h,w,x,y,count);

    System.out.println(min);

  }

  static boolean dfs (String[][] s, int h, int w, int x, int y, int count) {

    if (x >= h || y >= w) {
      return false;
    }

    if (s[x][y].equals("#")) {
      count++;
    }

    if (x == h-1 && y == w-1) {
      min = Math.min(count,min);
    }

    return dfs(s,h,w,x+1,y,count) || dfs(s,h,w,x,y+1,count);
  }
}
