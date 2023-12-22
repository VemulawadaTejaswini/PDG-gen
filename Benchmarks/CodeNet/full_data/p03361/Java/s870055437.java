import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[][] field = new String[h][w];
    for (int i = 0; i < h; i++) {
      field[i] = sc.next().split("");
    }
    int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (field[i][j].equals("#")) {
          boolean flg = false;
          for (int[] direction : directions) {
            if (i + direction[0] >= 0 && i + direction[0] < h && j + direction[1] >= 0 && j + direction[1] < w) {
              flg = flg || "#".equals(field[i + direction[0]][j + direction[1]]);
            }
          }
          if (!flg) {
            System.out.println("No");
            return;
          }
        }
      }
    }
    System.out.println("Yes");
  }
}