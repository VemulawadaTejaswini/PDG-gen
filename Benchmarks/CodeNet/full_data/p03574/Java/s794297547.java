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
    
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (m[i][j] == '.') {
          System.out.print(count(m, i, j));
        } else {
          System.out.print(m[i][j]);
        }
      }
      System.out.println();
    }
  }
  
  private static int[] di = { -1, -1, -1,  0, 0,  1, 1, 1 };
  private static int[] dj = { -1,  0,  1, -1, 1, -1, 0, 1 };

  private static int count(char[][] m, int i, int j) {

    int ret = 0;
    for (int v = 0; v < 8; v++) {
      int ii = i + di[v];
      int jj = j + dj[v];
      if (0 <= ii && ii < m.length && 0 <= jj && jj < m[i].length
         && m[ii][jj] == '#') {
        ret++;
      }
    }
    return ret;
  }
}