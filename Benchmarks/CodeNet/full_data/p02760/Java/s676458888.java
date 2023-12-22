import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] a = new int[3][3];
    boolean[][] s = new boolean[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        a[i][j] = scanner.nextInt();
      }
    }
    int N = scanner.nextInt();
    for (int i = 0; i < N; i++) {
      int b = scanner.nextInt();
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          if (a[j][k] == b) s[j][k] = true;
        }
      }
    }
    if (bingo(s)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean bingo(boolean[][] s) {
    for (int i = 0; i < 3; i++) if (s[i][0] && s[i][1] && s[i][2]) return true;
    for (int i = 0; i < 3; i++) if (s[0][i] && s[1][i] && s[2][i]) return true;
    if (s[0][0] && s[1][1] && s[2][2]) return true;
    if (s[0][2] && s[1][1] && s[2][0]) return true;
    return false;
  }
}
