import java.util.Scanner;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    (new Main()).run();
  }

  public void run() {
    Scanner sc = new Scanner(System.in);
    int[][] mx = new int[3][3];
    boolean[][] isOpened = new boolean[3][3];
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < 3; i++) {
        mx[i][j] = sc.nextInt();
      }
    }
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int b = sc.nextInt();
      check(mx, b, isOpened);
    }
    System.out.println(isBingo(isOpened) ? "Yes" : "No");
  }

  public void check(int[][] mx, int tryNumber, boolean[][] isOpened) {
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < 3; i++) {
        if (mx[i][j] == tryNumber) {
          isOpened[i][j] = true;
          return;
        }
      }
    }
    return;
  }

  public boolean isBingo(boolean[][] isOpened) {
    // 縦方向
    for (int i = 0; i < 3; i++) {
      if (isOpened[i][0] && isOpened[i][1] && isOpened[i][2]) {
        return true;
      }
    }
    // 横方向
    for (int j = 0; j < 3; j++) {
      if (isOpened[0][j] && isOpened[1][j] && isOpened[2][j]) {
        return true;
      }
    }
    // 対角線
    if (isOpened[0][0] && isOpened[1][1] && isOpened[2][2]) {
      return true;
    }
    if (isOpened[2][0] && isOpened[1][1] && isOpened[0][2]) {
      return true;
    }
    return false;
  }
}