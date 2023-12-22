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

  private static int count(char[][] m, int i, int j) {

    int ret = 0;

    if (0 < i && 0 < j && m[i-1][j-1] == '#') {
      ret++;
    }
    if (0 < i && m[i-1][j] == '#') {
      ret++;
    }
    if (0 < i && j < m[i].length-1 && m[i-1][j+1] == '#') {
      ret++;
    }
    
    if (0 < j && m[i][j-1] == '#') {
      ret++;
    }
    if (j < m[i].length-1 && m[i][j+1] == '#') {
      ret++;
    }
    
    if (i < m.length-1 && 0 < j && m[i+1][j-1] == '#') {
      ret++;
    }
    if (i < m.length-1 && m[i+1][j] == '#') {
      ret++;
    }
    if (i < m.length-1 && j < m[i].length-1 && m[i+1][j+1] == '#') {
      ret++;
    }
    
    return ret;
  }
}