import java.util.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] box = new char[h][w];
    boolean[] row = new boolean[h];
    boolean[] col = new boolean[w];
    for (int i = 0; i < h; i++) {
      box[i] = sc.next().toCharArray();
    }
    // 行を見る
    for (int i = 0; i < h; i++) {
      boolean isWhite = true;
      for (int j = 0; j < w; j++) {
        if (box[i][j] == '#') {
          isWhite = false;
          break;
        }
      }
      if (isWhite == true) {
        row[i] = true;
      }
    }
    // 列を見る
    for (int i = 0; i < w; i++) {
      boolean isWhite = true;
      for (int j = 0; j < h; j++) {
        if (box[j][i] == '#') {
          isWhite = false;
          break;
        }
      }
      if (isWhite == true) {
        col[i] = true;
      }
    }
    // 出力
    for (int i = 0; i < h; i++) {
      if (row[i] == true) continue;
      for (int j = 0; j < w; j++) {
        if (col[j] == true) continue;
        System.out.print(box[i][j]);
      }
      System.out.println();
    }
  }
}
