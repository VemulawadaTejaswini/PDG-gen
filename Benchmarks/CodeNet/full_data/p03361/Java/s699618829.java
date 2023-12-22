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
    boolean flag = true;
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        if(canvas[i][j] == 1) {
          flag &= check(i, j);
        }
      }
      if(!flag) break;
    }
    System.out.println((flag)? "Yes" : "No");
  }

  static boolean check(int x, int y) {
    boolean flag = false;
    if(0 < x && canvas[x-1][y] == 1) flag |= true;
    if(x < h - 1 && canvas[x+1][y] == 1) flag |= true;
    if(0 < y && canvas[x][y-1] == 1) flag |= true;
    if(y < w - 1 && canvas[x][y+1] == 1) flag |= true;
    return flag;
  }
}
